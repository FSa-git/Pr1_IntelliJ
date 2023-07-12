package _32_FastFoodBestellTool;

public class TabelleMain {

    public static void main(String[] args) {

        try {

            FoodDB_GUI dialog  = new FoodDB_GUI();
            dialog.pack();
            dialog.setVisible(true);
            System.exit(0);
            dialog.setLocation(500, 500);

        }
        catch (IllegalArgumentException event){
            System.out.println("Fehler");
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

}
