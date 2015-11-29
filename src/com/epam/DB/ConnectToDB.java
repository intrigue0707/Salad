package com.epam.DB;

import com.epam.Salad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Maryia on 11/27/2015.
 */
public class ConnectToDB {
    public static Connection c = null;
    private static Statement stmt = null;
    private static final String ToDB= "jdbc:sqlite:src/com/epam/DB/test.db";

    public static void createTable() {
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection(ToDB);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = new StringBuilder().append("CREATE TABLE MYSALAD").append("(ID INTEGER PRIMARY KEY, ").append("NAME TEXT,").append(" WEIGHT INT);").toString();
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Table was created successfully");
    }

    public static void insertTable() {
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection(ToDB);
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            Salad sal=new Salad();
           for ( String key : sal.mix.keySet()
                   ) {

                String sql = String.format("INSERT INTO MYSALAD (NAME) VALUES ('%s');", key );
               stmt.executeUpdate(sql);
            }
            for ( Double values : sal.mix.values()) {

                    String sql = String.format("INSERT INTO MYSALAD (WEIGHT) VALUES (%s);", values );
                stmt.executeUpdate(sql);
            }
            stmt.close();
            c.commit();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Records were created successfully");
    }
    public static void readfromDB()
    {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection(ToDB);
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM MYSALAD;" );
            while ( rs.next() ) {
                int id = rs.getInt("id");
                String  name = rs.getString("name");

                int weight  = rs.getInt("weight");

                System.out.println( "ID = " + id );
                System.out.println( "NAME = " + name );

                System.out.println( "WEIGHT = " + weight );

                System.out.println();
            }
            rs.close();
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Operation was done successfully");
    }


    public static void main(String[] args) {
        new ConnectToDB();

    }
}
