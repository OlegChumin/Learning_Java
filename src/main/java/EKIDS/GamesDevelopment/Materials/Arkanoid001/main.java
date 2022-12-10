package EKIDS.GamesDevelopment.Materials.Arkanoid001;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;

import javax.swing.JFrame;


public class main extends JFrame implements KeyListener {

	private int anchoVentana=600;
	private int altoVentana=400;
	
	private int anchoRaqueta=60;
	private int altoRaqueta=15;
	private int velRaqueta=7;
	
	private int velPelotaX=5;
	private int velPelotaY=5;
	private int ladoPelota=20;
	
	private int anchoBloque=40;
	private int altoBloque=15;

	private pelota pelota = new pelota(anchoVentana/2-ladoPelota/2, (altoVentana-ladoPelota)-altoRaqueta, velPelotaX, -velPelotaY, ladoPelota);
	//private pelota pelota = new pelota(550, 50, velPelotaX, -velPelotaY, ladoPelota);
	private raqueta raqueta = new raqueta(anchoVentana/2-anchoRaqueta/2, altoRaqueta, anchoRaqueta, velRaqueta);
	
	private int key=0;
	private long tiempoDeRun;
	private long tiempoDeSleep=20;
	private boolean run = false;
	private ArrayList <bloque> arrayBloques=new ArrayList <bloque> ();
	
	public static void main(String[] args) {
		new main();
	}

	
	public main(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(anchoVentana, altoVentana);
        this.setResizable(false);
        this.setLocation(100, 100);
        this.setVisible(true);
       
        this.createBufferStrategy(2);
        this.addKeyListener(this);
        
        while (true) {
        	if (!run)
				try {
					Thread.sleep(500);
					crearBloques();
					run=true;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
        	
            while(run){
            	calcularColisiones();
            	desplazamientoPelota();
            	desplazamientoRaqueta();
            	reiniciarJuego();
            	pintar();
            	sleep();
            }
        }
	}
	
    private void crearBloques(){
    	int i = 0;
    	
    		for(int y=60;y<250; y+= 20){
    			for (int x=30; x<anchoVentana-50; x+= 50){
    				arrayBloques.add(new bloque(x, y, altoBloque, anchoBloque, false));
    				i++;
    			}
    		}
    	i=0;
    	}
	
	private void calcularColisiones() {
		
		//Colision de la pelota contra la pared superior
		if (pelota.y <=25){
    		pelota.veloY = -pelota.veloY;
    	}
		//Colision de la pelota contra las paredes laterales
		if (pelota.x <=0 || pelota.x >= anchoVentana-pelota.ladoPelota){
    		pelota.veloX = -pelota.veloX;
    	}

		//Colision de la bola con la raqueta
    	if (pelota.x >= raqueta.x && pelota.x <= raqueta.x + raqueta.ancho && pelota.y >= altoVentana - raqueta.alto -20 && pelota.y <= altoVentana )
    		pelota.veloY = -pelota.veloY;
    	
    	//colision de los bloques
    	boolean colisionado = false;
        for (int i=0; i<arrayBloques.size(); i++) {
        	if (arrayBloques.get(i).destruido == false) {
        		if ((pelota.x >= arrayBloques.get(i).x && pelota.x <= arrayBloques.get(i).x + arrayBloques.get(i).ancho || pelota.x + pelota.ladoPelota >= arrayBloques.get(i).x && pelota.x + pelota.ladoPelota<= arrayBloques.get(i).x + arrayBloques.get(i).ancho) 
        				&& (pelota.y >= arrayBloques.get(i).y- pelota.ladoPelota && pelota.y <= arrayBloques.get(i).y || pelota.y + pelota.ladoPelota >= arrayBloques.get(i).y- pelota.ladoPelota && pelota.y + pelota.ladoPelota <= arrayBloques.get(i).y) ){
        			
        			if (pelota.x >= arrayBloques.get(i).x && pelota.x <= arrayBloques.get(i).x + arrayBloques.get(i).ancho || pelota.x + pelota.ladoPelota >= arrayBloques.get(i).x && pelota.x + pelota.ladoPelota<= arrayBloques.get(i).x + arrayBloques.get(i).ancho && colisionado==false){
        				pelota.veloY = -pelota.veloY;
        				colisionado=true;
        			}
        			if (pelota.y >= arrayBloques.get(i).y- pelota.ladoPelota && pelota.y <= arrayBloques.get(i).y ||pelota.y + pelota.ladoPelota >= arrayBloques.get(i).y- pelota.ladoPelota && pelota.y + pelota.ladoPelota <= arrayBloques.get(i).y && colisionado==false) {
        				pelota.veloX = -pelota.veloX;
        				colisionado=true;
        			}
        			arrayBloques.get(i).destruido = true;
        		}
        	}
        }
        colisionado = false;
	}
	
	private void desplazamientoPelota() {
		pelota.x += pelota.veloX;
    	pelota.y += pelota.veloY;
	}
	
	private void desplazamientoRaqueta() {
		if(raqueta.x>25 && key==KeyEvent.VK_UP) 
    		raqueta.x -= raqueta.velPaleta;
    	if(raqueta.x <anchoVentana-raqueta.ancho && key==KeyEvent.VK_DOWN) 
    		raqueta.x += raqueta.velPaleta;
	}
	
	private void reiniciarJuego() {
		if (pelota.y > altoVentana){
    		pelota.x = anchoVentana/2 - ladoPelota/2;
    		pelota.y = altoVentana - ladoPelota - raqueta.alto;
    		raqueta.x = anchoVentana/2 - anchoRaqueta/2;
    		arrayBloques.clear();
    		
    		run=false;
    	}
	}
	
	private void pintar(){
		BufferStrategy bf = this.getBufferStrategy();
        Graphics g = null;
       
        try {
            g = bf.getDrawGraphics();
                
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, anchoVentana, altoVentana);
            
            //pintamos la pelota
            g.setColor(Color.WHITE);
            g.fillOval(pelota.x, pelota.y, pelota.ladoPelota, pelota.ladoPelota);

            //pintamos las paletas
            g.setColor(Color.WHITE);
            g.fillRect(raqueta.x, altoVentana - raqueta.alto, raqueta.ancho, raqueta.alto);
            
            for (int i=0; i<arrayBloques.size(); i++) {
            	if (arrayBloques.get(i).destruido == false) {
                	g.setColor(Color.white);
                    g.fillRect(arrayBloques.get(i).x, arrayBloques.get(i).y-20, arrayBloques.get(i).ancho, arrayBloques.get(i).alto);
            	}
            }
            
        } finally {
            g.dispose();
        }
        bf.show();
             
        Toolkit.getDefaultToolkit().sync();
	}
	
    private void sleep(){
    	tiempoDeRun = ( System.currentTimeMillis() + tiempoDeSleep );
        while(System.currentTimeMillis() < tiempoDeRun) {
        
        }
    }
	
    
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		key=e.getKeyCode();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		 key=0;
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
