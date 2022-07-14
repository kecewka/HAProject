package kz.halykacademy.bookstore.DTO;

import kz.halykacademy.bookstore.DTO.Book;

import java.util.List;

public class Publisher {

    private String name;
    private List<Book> publishedBooksList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getPublishedBooksList() {
        return publishedBooksList;
    }

    public void setPublishedBooksList(List<Book> publishedBooksList) {
        this.publishedBooksList = publishedBooksList;
    }
}
