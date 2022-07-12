package kz.halykacademy.bookstore;

import java.util.List;

public class Publisher {
    private int id;
    private String name;
    private List<Book> publishedBooksList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getPublishedBooksList() {
        return publishedBooksList;
    }

    public void setPublishBooksList(List<Book> publishedBooksList) {
        this.publishedBooksList = publishedBooksList;
    }
}
