package AB_10.Einstieg;

public class StarterKlasse {

    public static void main(String[] args) {

        LKW MAN = new LKW();

        MAN.beschleunigen(0.5);

        System.out.println("Mein LKW hat die Beschleunigung: " + MAN.getAcceleration());

    }

}
