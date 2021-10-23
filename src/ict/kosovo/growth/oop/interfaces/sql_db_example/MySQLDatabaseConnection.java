package ict.kosovo.growth.oop.interfaces.sql_db_example;

import ict.kosovo.growth.oop.interfaces.sql_db_example.exceptions.SQLConnectionStringException;
import ict.kosovo.growth.oop.interfaces.sql_db_example.exceptions.SQLException;

import java.util.ArrayList;

public class MySQLDatabaseConnection implements DatabaseConnection {
    @Override
    public void connect(ConnectionString connectionString) throws SQLConnectionStringException {
        System.out.println("U konektua ne serverin: " + connectionString);
    }

    @Override
    public void open() throws SQLException {
        System.out.println("U hap koneksioni me serverin: ");
    }

    @Override
    public void dispose() {
        System.out.println(" U lirua nga memoria");
    }

    @Override
    public DatabaseConnection getDatabaseConnection() {
        return new MySQLDatabaseConnection();
    }

    @Override
    public int execute(String query) throws SQLException {
        if (query != null &&
                query.startsWith("INSERT") || query.startsWith("UPDATE")
                || query.startsWith("DELETE")
        ) return 1;
        return -1;
    }

    @Override
    public ArrayList<Object> executeReader(String query) throws SQLException {
        return null;
    }

    @Override
    public void close() throws Exception {
        System.out.println("U mbyll koneksioni");
    }
}
