package br.myconnection;

import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import org.apache.ibatis.jdbc.ScriptRunner;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.SQLSyntaxErrorException;


public class ConnectionMySql {
    public Connection getConnection() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db?serverTimezone=UTC",
                    "admin",
                    "admin"
            );

        }catch (Exception e){
            System.out.println("Error on connection " + e.getMessage());
            return null;
        }

        try {
            ScriptRunner sr = new ScriptRunner(conn);
            Reader reader = new BufferedReader(new FileReader("./src/init.sql"));
            sr.runScript(reader);

            return conn;

        }catch (Exception e) {
            System.out.println("Table already exists " + e.getMessage());
            return null;
        }

    }

    public void createTables() {

    }
}