package AB_30.Bundespraesident;

public class Tester {

    public static void main(String[] args) {

        Bundespraesident Steinmeier = new Bundespraesident("Frank-Walter", 23);

        System.out.println("Hallo, mein Name ist: " + Steinmeier.name + " und mein Rabatt liegt bei " + Steinmeier.getRabattProzent() + "%");

    }
}
