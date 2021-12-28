package Required;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

/*
 * @author Vinu_Gawade
 */
public class DBconnect {

    public static Connection conn;

    public static Connection getConnect() {
        try {
            try {
                Class.forName("org.sqlite.JDBC");
            } catch (ClassNotFoundException e) {
                System.out.println(e + " DBconnect@19 \n" + Arrays.toString(e.getStackTrace()));
            }

            conn = DriverManager.getConnection("jdbc:sqlite:" + System.getProperty("user.dir") + "\\src\\Required\\JavaDB.db");
            System.out.println("Connection to SQLite has been established.");

            return conn;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "PLEASE RUN SOFTWARE AS ADMINISTRATOR.");
            System.out.println(e + " DBconnect@28\n" + Arrays.toString(e.getStackTrace()));
        }
        return conn;
    }

    public static void main(String[] arg) {
        DBconnect.getConnect();
    }
}
