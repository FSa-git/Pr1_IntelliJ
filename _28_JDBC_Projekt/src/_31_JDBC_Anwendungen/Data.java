package _31_JDBC_Anwendungen;

public interface Data {

    // Datenbank-Verbindungsdaten

    // Treiber-Klasse

    public static final String dbTreiber = "org.mariadb.jdbc.Driver";
    // Datenbankserver (DNS-Name oder IP Adresse angeben)
    public static final String host = "localhost";
    // DBMS Server Port (Standardport MySQL: 3306)
    public static final String port = "8889";
    public static final String db = "it_center_v2012"; // Datenbankname
    public static final String user = "root"; // Datenbank-User
    public static final String passwd = "root"; // Password
    // public static final String table = "personen"; // Tabellenname

}
