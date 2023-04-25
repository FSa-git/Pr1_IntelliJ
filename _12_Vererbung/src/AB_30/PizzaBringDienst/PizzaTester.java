package AB_30.PizzaBringDienst;

public class PizzaTester {

    public static void main(String[] args) {
        PizzaSpecial Passione = new PizzaSpecial("Calabria", 3.2f, "scharf",5);

        System.out.println("Der Preis beträgt " + Passione.getPreis());
        System.out.println("Und gehört zur Klasse: " + Passione.getClass());
    }
}
