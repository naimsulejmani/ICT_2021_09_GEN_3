package ict.kosovo.growth.oop.interfaces.sql_db_example;

import ict.kosovo.growth.oop.interfaces.sql_db_example.exceptions.SQLConnectionStringException;
import ict.kosovo.growth.oop.interfaces.sql_db_example.exceptions.SQLException;

import java.util.ArrayList;
//kontrata
public interface DatabaseConnection extends AutoCloseable {
    void connect(ConnectionString connectionString) throws SQLConnectionStringException;

    void open() throws SQLException;

    // void close() throws SQLException;
    void dispose();

    DatabaseConnection getDatabaseConnection();

    int execute(String query) throws SQLException; // "INSERT INTO tblX" - CREATE, UPDATE, DELETE

    ArrayList<Object> executeReader(String query) throws SQLException;
}
