package _32_FastFoodBestellTool;

import java.text.DecimalFormat;

public class BusinessLogik {
    private DecimalFormat df = new DecimalFormat("0.00");

    public double calculateTotalPrice(double preis1, double preis2, double preis3, double preis4) {
        return preis1 + preis2 + preis3 + preis4;
    }

    public double rabatt(double summe, String code) {
        if (code.equals("CODEWELLI")) {
            summe = summe * 0.9;
        } else if (code.equals("CODEFRANCI")) {
            summe = summe * 0.8;
        } else if (code.equals("CODEADV")) {
            summe = summe * 0.85;
        } else if (code.equals("CODE3BKI")) {
            summe = summe * 0.75;
        }
        return summe;
    }

    public String formatPrice(double price) {
        return df.format(price) + " €";
    }

    public void printBeleg(double summe, String code) {
        System.out.println("-------------------");
        System.out.println("Rabattcode: " + code + " eingelöst");
        System.out.println("-------------------");
        System.out.println("Gesamtsumme: " + formatPrice(summe));
        System.out.println("-------------------");
        System.out.println("Vielen Dank für Ihren Einkauf!");
        System.out.println("-------------------");
        System.out.println();
    }

    public String getPaymentMethod(boolean bar, boolean kreditkarte, boolean paypal, boolean bitcoin) {
        if (bar) {
            return "Bar";
        } else if (kreditkarte) {
            return "Kreditkarte";
        } else if (paypal) {
            return "PayPal";
        } else if (bitcoin) {
            return "BitCoin";
        } else {
            return "Keine ausgewählt";
        }
    }
}

