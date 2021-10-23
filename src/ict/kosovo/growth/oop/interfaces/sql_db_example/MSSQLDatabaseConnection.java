package ict.kosovo.growth.oop.interfaces.sql_db_example;

import ict.kosovo.growth.oop.interfaces.sql_db_example.exceptions.SQLConnectionStringException;
import ict.kosovo.growth.oop.interfaces.sql_db_example.exceptions.SQLException;

import java.util.ArrayList;

public class MSSQLDatabaseConnection implements DatabaseConnection{
    @Override
    public void connect(ConnectionString connection) throws SQLConnectionStringException {
        //zakonisht sherben me kriju lidhje me serverin
        //me i kontrollu parametrat e conneciton string
        //jdbc:mssql://192.168.1.100:3306;databaseName=ICKKosovo;userName=ictuser;password=123456
        //String.split(;//)
        //nese ka gabim gjuaje naj error
        if(false) {
            throw new SQLConnectionStringException("Mungon parametri Username & Password");
        }
    }

    @Override
    public void open() throws SQLException {
        throw new SQLException("Firewass is not open, it block the connection");
    }

    @Override
    public void dispose() {

    }

    @Override
    public DatabaseConnection getDatabaseConnection() {
        return new MSSQLDatabaseConnection();
    }

    @Override
    public int execute(String query) throws SQLException {
        return 1;
    }

    @Override
    public ArrayList<Object> executeReader(String query) throws SQLException {
        return null;
    }

    @Override
    public void close() throws Exception {

    }
}
