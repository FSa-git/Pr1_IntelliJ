package Blatt_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MiniRechner {
    public static void main(String[] args) {

        // Deklaration
        int zaehler, nenner, divison;

        try {

            Scanner sc = new Scanner(System.in); System.out.println("Division zweier int-Zahlen");

            System.out.println("**********************"); System.out.println("Bitte geben Sie den Zähler ein: ");
            zaehler = sc.nextInt();

            System.out.println("Bitte geben Sie den Nenner ein: ");
            nenner = sc.nextInt();

            divison = zaehler / nenner;
            System.out.println("Ergebnis aus " + zaehler + " / " + nenner + " = " + divison);

            sc.close();

        } catch (InputMismatchException ex) {
            System.out.println("*******Ich bin im catch Nr. 1******");
            String name = ex.getClass().getName();

            System.out.println("Name: " + name);

        }

        catch (ArithmeticException ey) {
            String msg = ey.getMessage();
            System.out.println("*******Ich bin im catch Nr. 2******");
            System.out.println("Message:" + msg);
        }

        catch (Exception e) {

            System.out.println("*******Ich bin im catch******");

            // Die Mindestausgabe
            e.printStackTrace(); // Mindestausgabe damit man versteht, dass man hier rausfliegt
        }
        // Für Aufräumarbeiten Bsp. in den Datenbanknen
        finally {

        }


    }

}

