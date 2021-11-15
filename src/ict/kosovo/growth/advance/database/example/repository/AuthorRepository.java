package ict.kosovo.growth.advance.database.example.repository;

import ict.kosovo.growth.advance.database.example.infrastructure.DbHelper;
import ict.kosovo.growth.advance.database.example.models.Author;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AuthorRepository extends DbHelper implements CrudableRepository<Author, Integer>,
ToObjectable<Author>{

    @Override
    public boolean add(Author item) {
        String query = "INSERT INTO Author(Name, Surname, IsActive) VALUES (?, ?, ?);";
        try(
            Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(query);
        ) {
            statement.setString(1,item.getName());
            statement.setString(2,item.getSurname());
            statement.setBoolean(3,item.isActive());

            int rowAffected = statement.executeUpdate();

            return rowAffected>0;

        } catch (SQLException throwables) {
            System.out.println(throwables.getMessage());
            return false;
        }

    }

    @Override
    public boolean update(Author item) {
        String query = "UPDATE Author SET Name=?, Surname=?, IsActive=? WHERE Id=?";
        try(
                Connection connection = getConnection();
                PreparedStatement statement = connection.prepareStatement(query);
        ) {
            statement.setString(1,item.getName());
            statement.setString(2,item.getSurname());
            statement.setBoolean(3,item.isActive());
            statement.setInt(4,item.getId());

            int rowAffected = statement.executeUpdate();

            return rowAffected>0;

        } catch (SQLException throwables) {
            System.out.println(throwables.getMessage());
            return false;
        }
    }

    @Override
    public boolean delete(Author item) {
        return deleteById(item.getId());
    }

    @Override
    public boolean deleteById(Integer key) {
        String query = "DELETE FROM Author WHERE Id=?";
        try(
                Connection connection = getConnection();
                PreparedStatement statement = connection.prepareStatement(query);
        ) {
            statement.setInt(1,key);

            int rowAffected = statement.executeUpdate();

            return rowAffected>0;

        } catch (SQLException throwables) {
            System.out.println(throwables.getMessage());
            return false;
        }
    }

    @Override
    public Author getById(Integer key) {
        String query = "SELECT * FROM Author WHERE Id=?";
        try(
                Connection connection = getConnection();
                PreparedStatement statement = connection.prepareStatement(query);
        ) {
            statement.setInt(1,key);

            //DataReader (IDataReader) reader -> C#
            ResultSet resultSet = statement.executeQuery();
            Author author = null;
            //a ka rekorde brenda result set-it te kthyer nga databaza
            if(resultSet.next()) {
//                int id = resultSet.getInt("Id");
//                String name = resultSet.getString("Name");
//                String surname = resultSet.getString("Surname");
//                boolean isActive = resultSet.getBoolean("IsActive");
//                author = new Author(id,name,surname,isActive);
                author = toObject(resultSet);
            }
            return author;

        } catch (SQLException throwables) {
            System.out.println(throwables.getMessage());
            return null;
        }

    }

    @Override
    public List<Author> getAll() {
        String query = "SELECT * FROM Author";
        try(
                Connection connection = getConnection();
                PreparedStatement statement = connection.prepareStatement(query);
        ) {
            List<Author> authors = null;
            //DataReader (IDataReader) reader -> C#
            ResultSet resultSet = statement.executeQuery();
            authors = new ArrayList<>();

            while(resultSet.next()) {
                Author author = toObject(resultSet);
                authors.add(author);
            }

            return authors;

        } catch (SQLException throwables) {
            System.out.println(throwables.getMessage());
            return null;
        }

    }

    @Override
    public Author toObject(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("Id");
        String name = resultSet.getString("Name");
        String surname = resultSet.getString("Surname");
        boolean isActive = resultSet.getBoolean("IsActive");
        Author author = new Author(id,name,surname,isActive);
       return author;
    }
}
