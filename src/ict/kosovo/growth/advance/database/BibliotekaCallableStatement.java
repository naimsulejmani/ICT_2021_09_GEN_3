package ict.kosovo.growth.advance.database;

import java.sql.*;

public class BibliotekaCallableStatement {
    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://127.0.0.1:1433;databaseName=Biblioteka;user=ictuser;password=ictuser";

        try {
            Connection connection = DriverManager.getConnection(connectionUrl);
            String query = "EXEC dbo.usp_InsertAuthor ?, ?, ?";

            CallableStatement statement = connection.prepareCall(query);
        //    statement.registerOutParameter(1, Types.INTEGER);
            statement.setString(1, "Filan");
            statement.setString(2, "Fisteku");
            statement.setBoolean(3, false);
            // statement.setObject(1, 10, Types.INTEGER);

            boolean isQuery = statement.execute();

            if(isQuery) {
                System.out.println("Duhet me handle (trajtu) result set");
            }
            else {
                System.out.println("U regjistrua me suksese");
//                int outputParameter = statement.getInt(1);
//                System.out.println("Output parameter = "+outputParameter);
            }


            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
