package _31_JDBC_Anwendungen;

import java.sql.*;

public class DBTabelleLesen implements Data {

    public static Connection baueVerbindungAuf () {

        Connection verbindung = null;

        try {

            Class.forName(dbTreiber);

            String s = "jdbc:mariadb://" + host + ":" + port + "/" + db + "?user=" + user + "&password=" + passwd;

            verbindung = DriverManager.getConnection(s);

        } catch ( ClassNotFoundException e ) {
            e.printStackTrace();
            System.out.println("Treiber nicht gefunden!");
        } catch ( SQLException e ) {
            System.out.println("Verbindung nicht möglich!" + e.getMessage());
        } catch ( Exception e ) {
            e.printStackTrace();
        }

        return verbindung;

    }

    public static void leseTabelle ( Connection dbVerbindung ) {

        String sQuery = "SELECT ArtikelNr, ArtikelName, ArtikelGruppe, Einstandspreis, Lagerbestand FROM Artikel";

        try ( Statement stmt = dbVerbindung.createStatement() ) {

            ResultSet rs = stmt.executeQuery(sQuery);

            while ( rs.next() ) {
                String sArtikelNr = rs.getString("ArtikelNr");
                String sArtikelName = rs.getString("ArtikelName");
                String sArtikelGruppe = rs.getString("ArtikelGruppe");
                double dEinstandspreis = rs.getFloat("Einstandspreis");
                int iLagerbestand = rs.getInt("Lagerbestand");

                if ( sArtikelName.length() > 50 ) {
                    sArtikelName = sArtikelName.substring(0, 50);
                }

                System.out.printf("%-6s %-50s %-13s %8.2f € %5d\n", sArtikelNr, sArtikelName, sArtikelGruppe, dEinstandspreis, iLagerbestand);
            }

        } catch ( SQLException e ) {
            System.out.println(e.getMessage());
        }

    }

}
