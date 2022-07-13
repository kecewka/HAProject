package kz.halykacademy.bookstore.Providers;

import kz.halykacademy.bookstore.DTO.Author;

import java.util.List;

public interface AuthorProvider {
    public List<Author> getAll();
}
