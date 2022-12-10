package EKIDS.Lessons.Lesson08.Sound;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;
public class AudioCapture01 extends JFrame {
    boolean stopCapture = false;
    ByteArrayOutputStream
            byteArrayOutputStream;
    AudioFormat audioFormat;
    TargetDataLine targetDataLine;
    AudioInputStream audioInputStream;
    SourceDataLine sourceDataLine;

    public static void main(
            String args[]){
        new AudioCapture01();
    }//end main

    public AudioCapture01(){
        final JButton captureBtn =
                new JButton("Capture");
        final JButton stopBtn =
                new JButton("Stop");
        final JButton playBtn =
                new JButton("Playback");

        captureBtn.setEnabled(true);
        stopBtn.setEnabled(false);
        playBtn.setEnabled(false);

        captureBtn.addActionListener(
                new ActionListener(){
                    public void actionPerformed(
                            ActionEvent e){
                        captureBtn.setEnabled(false);
                        stopBtn.setEnabled(true);
                        playBtn.setEnabled(false);
                        //Захват данных
                        // с микрофона
                        //пока не нажата Stop
                        captureAudio();
                    }
                }
        );
        getContentPane().add(captureBtn);

        stopBtn.addActionListener(
                new ActionListener(){
                    public void actionPerformed(
                            ActionEvent e){
                        captureBtn.setEnabled(true);
                        stopBtn.setEnabled(false);
                        playBtn.setEnabled(true);
                        //Остановка захвата
                        // информации с микрофона

                        stopCapture = true;
                    }
                }
        );
        getContentPane().add(stopBtn);

        playBtn.addActionListener(
                new ActionListener(){
                    public void actionPerformed(
                            ActionEvent e){
                        //Проигрывание данных
                        // которые были записаны

                        playAudio();
                    }
                }
        );
        getContentPane().add(playBtn);

        getContentPane().setLayout(
                new FlowLayout());
        setTitle("Capture/Playback Demo");
        setDefaultCloseOperation(
                EXIT_ON_CLOSE);
        setSize(250,70);
        setVisible(true);
    }

    //Этот метод захватывает аудио
    // с микрофона и сохраняет
    // в объект ByteArrayOutputStream
    private void captureAudio(){
        try{
            //Установим все для захвата

            audioFormat = getAudioFormat();
            DataLine.Info dataLineInfo =
                    new DataLine.Info(
                            TargetDataLine.class,
                            audioFormat);
            targetDataLine = (TargetDataLine)
                    AudioSystem.getLine(
                            dataLineInfo);
            targetDataLine.open(audioFormat);
            targetDataLine.start();

            //Создаем поток для захвата аудио
            // и запускаем его
            //он будет работать
            //пока не нажмут кнопку
            Thread captureThread =
                    new Thread(
                            new CaptureThread());
            captureThread.start();
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }
    }

    //Этот метод проигрывает аудио
    // данные, которые были сохранены
    // в ByteArrayOutputStream
    private void playAudio() {
        try{
            //Устанавливаем всё
            //для проигрывания

            byte audioData[] =
                    byteArrayOutputStream.
                            toByteArray();

            InputStream byteArrayInputStream
                    = new ByteArrayInputStream(
                    audioData);
            AudioFormat audioFormat =
                    getAudioFormat();
            audioInputStream =
                    new AudioInputStream(
                            byteArrayInputStream,
                            audioFormat,
                            audioData.length/audioFormat.
                                    getFrameSize());
            DataLine.Info dataLineInfo =
                    new DataLine.Info(
                            SourceDataLine.class,
                            audioFormat);
            sourceDataLine = (SourceDataLine)
                    AudioSystem.getLine(
                            dataLineInfo);
            sourceDataLine.open(audioFormat);
            sourceDataLine.start();

            //Создаем поток для проигрывания
            // данных и запускаем его
            // он будет работать пока
            // все записанные данные не проиграются

            Thread playThread =
                    new Thread(new PlayThread());
            playThread.start();
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }
    }

    //Этот метод создает и возвращает
    // объект AudioFormat

    private AudioFormat getAudioFormat(){
        float sampleRate = 8000.0F;
        //8000,11025,16000,22050,44100
        int sampleSizeInBits = 16;
        //8,16
        int channels = 1;
        //1,2
        boolean signed = true;
        //true,false
        boolean bigEndian = false;
        //true,false
        return new AudioFormat(
                sampleRate,
                sampleSizeInBits,
                channels,
                signed,
                bigEndian);
    }
//===================================//

    //Внутренний класс для захвата
// данных с микрофона
    class CaptureThread extends Thread{

        byte tempBuffer[] = new byte[10000];
        public void run(){
            byteArrayOutputStream =
                    new ByteArrayOutputStream();
            stopCapture = false;
            try{


                while(!stopCapture){


                    int cnt = targetDataLine.read(
                            tempBuffer,
                            0,
                            tempBuffer.length);
                    if(cnt > 0){
                        //Сохраняем данные в выходной поток

                        byteArrayOutputStream.write(
                                tempBuffer, 0, cnt);
                    }
                }
                byteArrayOutputStream.close();
            }catch (Exception e) {
                System.out.println(e);
                System.exit(0);
            }
        }
    }
    //===================================//
//Внутренний класс  для
// проигрывания сохраненных аудио данных
    class PlayThread extends Thread{
        byte tempBuffer[] = new byte[10000];

        public void run(){
            try{
                int cnt;
                // цикл пока не вернется -1

                while((cnt = audioInputStream.
                        read(tempBuffer, 0,
                                tempBuffer.length)) != -1){
                    if(cnt > 0){
                        //Пишем данные во внутренний
                        // буфер канала
                        // откуда оно передастся
                        // на звуковой выход
                        sourceDataLine.write(
                                tempBuffer, 0, cnt);
                    }
                }

                sourceDataLine.drain();
                sourceDataLine.close();
            }catch (Exception e) {
                System.out.println(e);
                System.exit(0);
            }
        }
    }
//===================================//

}//end outer class AudioCapture01.java

