package kz.halykacademy.bookstore.Providers;

import kz.halykacademy.bookstore.DTO.Book;

import java.util.List;

public interface BookProvider {
    public List<Book> getAll();
}
