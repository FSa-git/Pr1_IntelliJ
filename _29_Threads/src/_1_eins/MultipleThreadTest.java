package _1_eins;

public class MultipleThreadTest {

    public static void main(String[] args) {

        Zaehler myZaehler = new Zaehler();

        Thread secondThread = new Thread(myZaehler, "second");

        secondThread.start();

        myZaehler.run();

    }

}
