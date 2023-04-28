package Freitag_28;

public class Reader {

    public static void main(String[] args) {

        long Start_time = System.nanoTime();

        file_reader.read();

        long End_time = System.nanoTime();

        System.out.println(End_time - Start_time);

    }

}
