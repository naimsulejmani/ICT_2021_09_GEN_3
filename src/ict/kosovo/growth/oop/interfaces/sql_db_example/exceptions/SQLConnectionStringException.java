package ict.kosovo.growth.oop.interfaces.sql_db_example.exceptions;

public class SQLConnectionStringException extends SQLException {
    public SQLConnectionStringException() {

    }

    public SQLConnectionStringException(String message) {
        super(message);
    }
}
