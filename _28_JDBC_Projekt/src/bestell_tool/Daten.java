package bestell_tool;

public interface Daten {

    // Datenbank-Verbindungsdaten

    // Treiberklasse
    String dbTreiber = "org.mariadb.jdbc.Driver";

    // Datenbankserver (DNS-Name oder IP-Adresse angeben)
    String host = "localhost";

    // DBMS Server Port
    String port = "8889";

    // Datenbankbanke
    String db = "Bezeichnung";

    // Datenbankzugangsdaten
    String user = "root";
    String passwd = "root";

}
