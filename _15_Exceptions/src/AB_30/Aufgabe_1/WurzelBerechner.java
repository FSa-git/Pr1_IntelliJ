package AB_30.Aufgabe_1;

public class WurzelBerechner {

    public static void main(String[] args) {

        double input = 4;
        double ergebnis;

        try {
            ergebnis = berechneWurzel(input);
            System.out.println("wurzel" + ergebnis);
        }
        catch (ArithmeticException ex){
            System.out.println("Nenner hat den Zahlenwert '0'");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
        static double berechneWurzel(double x){
            return Math.sqrt(x);
        }
}
