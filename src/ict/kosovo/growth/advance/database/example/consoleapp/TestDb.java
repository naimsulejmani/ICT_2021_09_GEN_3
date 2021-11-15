package ict.kosovo.growth.advance.database.example.consoleapp;

import ict.kosovo.growth.advance.database.example.models.Author;
import ict.kosovo.growth.advance.database.example.repository.AuthorRepository;
import ict.kosovo.growth.advance.database.example.repository.CrudableRepository;
import ict.kosovo.growth.oop.polymorphism.covariant_type.A;

import java.util.List;

public class TestDb {
    public static void main(String[] args) {

        CrudableRepository<Author,Integer> authorRepository = new AuthorRepository();

//        authorRepository.add(new Author("Ndriqim","Behrami",false));

        authorRepository.deleteById(2);
        authorRepository.deleteById(3);

        List<Author> authors = authorRepository.getAll();

        for(Author author: authors) {
            System.out.println(author);
        }

        Author author = authorRepository.getById(6);

        author.setSurname("Gashi");
        author.setName("Vlora");

        authorRepository.update(author);

        System.out.println("Autori me id 6 eshte: "+author);
    }
}
