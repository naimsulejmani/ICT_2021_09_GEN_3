package ict.kosovo.growth.advance.database;

import java.sql.*;

public class BibliotekaExampleStatementSelect {
    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://127.0.0.1:1433;databaseName=Biblioteka;user=ictuser;password=ictuser";

        try {
            Connection connection = DriverManager.getConnection(connectionUrl);
            System.out.println("Urime u konektuat krijuat sesion me serverin!");
            String query = "SELECT * FROM dbo.Author;";

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()) {
                System.out.printf("%30s | %30s | %10b%n",
                        resultSet.getString("Name"),resultSet.getString("Surname"),
                        resultSet.getBoolean("IsActive")
                        );
            }

            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
