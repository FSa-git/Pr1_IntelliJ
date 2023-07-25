package _1_eins;

public class Zaehler implements Runnable{


    @Override
    public void run() {

        // private int point = 0;

        Thread thread = Thread.currentThread();

        for (int i = 0; i < 1000; i++){
            System.out.println("Thread" + thread + "\t" + i);
        }

    }
}
