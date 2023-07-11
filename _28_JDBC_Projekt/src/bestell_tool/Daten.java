package bestell_tool;

public interface Daten {

    // Datenbank-Verbindungsdaten

    // Treiberklasse
    String dbTreiber = "org.mariadb.jdbc.Driver";

    // Datenbankserver (DNS-Name oder IP-Adresse angeben)
    String host = "127.0.0.1";

    // DBMS Server Port
    String port = "8889";

    // Datenbankbankname
    String db = "KrustyKrab";

    // Datenbankzugangsdaten
    String user = "root";
    String passwd = "root";

}
