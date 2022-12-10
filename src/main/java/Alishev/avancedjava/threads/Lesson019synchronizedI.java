package Alishev.avancedjava.threads;

public class Lesson019synchronizedI {
    //когда необходимо чтобы потоки по очереди обращались к полю например один пишет, а все остальные читают
    //volatile не подходит и применяется synchonized
    private int counter;

    public static void main(String[] args) throws InterruptedException {
        //создаем потоки, которые будут делить одно поле
        Lesson019synchronizedI test = new Lesson019synchronizedI(); // при создании каждого объекта
        // этому объекту присваивается сущность monitor
        //синхронизация происходит только на объекте
        // монитор в один момент времени может принадлежать только одному потоку (поток =объект)
        // синхронизация без указания происходит на текущем объекте this (переменная ссылочного типа текущего объекта)
        test.doWork();
    }

    public synchronized void increment() { //после добавления synchronized получили = 20 000
        // только 1 поток в момент времени получает доступ к телу метода где, инкрементируется поле counter
        counter++;
    }

    public void doWork() throws InterruptedException { // используем анонимный класс
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    increment();
                    //counter = counter + 1;// берется старое значение counter потом добавляется 1, затем
                    // записывается новое значение, операция не атомарна, внутри 3 операции.
                    // Атомарная занимает 1 такт времени
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    //counter = counter + 1;
                    increment();
                }
            }
        });
        thread1.start(); //запуск первой нити(потока) в методе doWork
        /*
         * thread1 -> 1 -. 2 ->3-Ю(получил опять 1 и сделал 2) -->2
         * thread2 .............->1....получил 2 а сам пишет 2 (нет изменений)
         * для решения проблемы доступа к полю есть synchronized но оно применяется для методов
         * */
        thread2.start(); //запуск второй нити(потока) в методе doWork

        // здесь main ждет выполнения всех потоков, который обозначены join (потоки при этом
        // работают все что запущены)
        thread1.join(); // ждем завершение потока thread1 здесь поток ждет отработку thread1
        thread2.join(); // ждем завершение потока thread2 здесь поток ждет отработку thread2
        //чтобы поток main не вызвал вывод на экран сразу, а дождался завершения всех потоков
        System.out.println(counter);
    } //end of doWork()

}
