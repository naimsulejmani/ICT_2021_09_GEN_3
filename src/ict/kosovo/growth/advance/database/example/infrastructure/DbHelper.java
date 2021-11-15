package ict.kosovo.growth.advance.database.example.infrastructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    private Connection connection;
    private String connectionUrl =  "jdbc:sqlserver://127.0.0.1:1433;databaseName=Biblioteka;user=ictuser;password=ictuser";

    public Connection getConnection() throws SQLException {
        if (this.connection == null || this.connection.isClosed()) {
            try {
                connection = DriverManager.getConnection(connectionUrl);
            }catch (SQLException ex) {
                System.out.println("Gabim gjate konektimit!!!");
                connection = null;
            }
        }
        return connection;
    }

    public String getConnectionUrl() {
        return connectionUrl;
    }

    public void setConnectionUrl(String connectionUrl) {
        this.connectionUrl = connectionUrl;
    }
}
