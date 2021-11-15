package ict.kosovo.growth.advance.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BibliotekaExample1 {

    public static void main(String[] args) {
        // Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://127.0.0.1:1433;databaseName=Biblioteka;user=ictuser;password=ictuser";

        try {
            Connection connection = DriverManager.getConnection(connectionUrl);
            System.out.println("Urime u konektuat krijuat sesion me serverin!");
            String insertQuery = "INSERT INTO dbo.Author (Name,Surname,IsActive) VALUES ('C','D',1)";

            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();


            int rowAffected = statement.executeUpdate(insertQuery);//CREATE, INSERT< UPDATE, DELETE< ALTER< DROP ...
            System.out.printf("(%d row affected)%n", rowAffected);

            if(rowAffected<=0) connection.rollback();

            connection.commit();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
