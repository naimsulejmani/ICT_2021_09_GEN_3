package ict.kosovo.growth.advance.database.example.repository;

import java.util.List;

public interface CrudableRepository<T, Tid> {
    boolean add(T item);

    boolean update(T item);
    boolean delete(T item);
    boolean deleteById(Tid key);

    T getById(Tid key);

    List<T> getAll();
}
