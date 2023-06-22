package _30_AB2_2;

public class LambdaTestDruck {

    public static void main(String[] args) {

        // Verkürzte schreibweise um Methoden wegzulassen und eine kurzschreibweise zu implementieren
        drucker drucki = (s, t) -> {

            t = t.toUpperCase();
            System.out.println(s + " " + t);

        };

        drucki.ausdrucken("ADVler sind", "auch in Krisen ruhig und gelassen");

    }

}
