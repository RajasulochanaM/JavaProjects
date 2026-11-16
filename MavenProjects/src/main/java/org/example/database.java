package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class database {
        public static void main(String[] args) throws Exception {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "Root@1234"
            );

            System.out.println("Database connected!");

            con.close();
        }
}

