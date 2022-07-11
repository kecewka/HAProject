package kz.halykacademy.bookstore;

import java.util.List;

public class Publisher {
    private int id;
    private String name;
    private List<Book> publishBooksList;

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

    public List<Book> getPublishBooksList() {
        return publishBooksList;
    }

    public void setPublishBooksList(List<Book> publishBooksList) {
        this.publishBooksList = publishBooksList;
    }
}
