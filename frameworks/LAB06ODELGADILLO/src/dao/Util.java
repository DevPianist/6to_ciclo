package dao;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {

    @SuppressWarnings("static-access")
    public static Connection getConnection(){
        Connection cn = null;
        try {
            Driver.class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/db_lab07?serverTimezone=UTC&characterEncoding=utf8","root", "");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();

        }

        return cn;
    }

}