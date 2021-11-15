package ict.kosovo.growth.advance.database.example.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ToObjectable<T> {
    T toObject(ResultSet resultSet) throws SQLException;
}
