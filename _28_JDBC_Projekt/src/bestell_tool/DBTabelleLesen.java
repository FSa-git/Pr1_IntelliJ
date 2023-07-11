package bestell_tool;

import java.sql.*;

public class DBTabelleLesen implements Daten{

    public static Connection baueVerbindungAuf() {
        Connection verbindung = null;

        try{
            // Class.forName(dbTreiber);
            // String s = "jdbc:mariadb://" + host + ":" + port + "/" + db + "?" + "?user=" + user + "&" + "&password=" + passwd;

            // verbindung = DriverManager.getConnection(s);
            verbindung = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:8889/KrustyKrab", "root", "root");
        }
        catch (SQLException e) {
            System.out.println("Connect nicht moeglich:" + e.getMessage());
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return verbindung;

}

public static void leseTabelleFoods (Connection dbVerbindung){

        String sQuery = "SELECT Bezeichnung FROM Foods ORDER BY CASE WHEN Bezeichnung = 'Bitte Auswählen' THEN 0 ELSE 1 END, Preis ASC";

        try (Statement stmt = dbVerbindung.createStatement()) {
            ResultSet rs = stmt.executeQuery(sQuery);

            while (rs.next()) {
                String sBezeichnung = rs.getString("Bezeichnung");

               // if (sBezeichnung != null) {
                 //   System.out.println(sBezeichnung);
                // }

            }
        }
            catch (SQLException e){
                System.out.println("Fehler bei der Abfrage: " + e.getMessage());
            }
}

}
