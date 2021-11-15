package ict.kosovo.growth.advance.database;

import java.sql.*;

public class BibliotekaPreparedStatement {
    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://127.0.0.1:1433;databaseName=Biblioteka;user=ictuser;password=ictuser";

        try {
            Connection connection = DriverManager.getConnection(connectionUrl);
            String query = "SELECT * FROM dbo.Author WHERE id = ?";

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1,2);
           // statement.setObject(1, 10, Types.INTEGER);

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.printf("%30s | %30s | %10b%n",
                        resultSet.getString("Name"), resultSet.getString("Surname"),
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
