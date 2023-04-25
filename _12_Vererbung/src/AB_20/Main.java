package AB_20;

public class Main {

    public static void main(String[] args) {

        // Erzeuge einen Mitarbeiter
        Mitarbeiter HansDietrich = new Mitarbeiter("Hans-Dieter","Dietrich", 1650);
        Auszubildender Peter = new Auszubildender("Peter", "Meier", 1100, "Informatiker",2);

        System.out.println(Peter.azubiJahr);


    }

}
