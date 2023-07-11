package bestell_tool;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author F.Sa
 */

public class Demo1_Start {

    public static void main(String[] args) throws SQLException {

        Connection dbVerbindung = null;

        dbVerbindung = DBTabelleLesen.baueVerbindungAuf();

        if (dbVerbindung != null) {
            DBTabelleLesen.leseTabelleFoods(dbVerbindung);
            dbVerbindung.close();
        }

    }

}
