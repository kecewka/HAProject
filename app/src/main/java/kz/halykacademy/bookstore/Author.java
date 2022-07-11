package kz.halykacademy.bookstore;

import java.time.LocalDate;
import java.util.List;

public class Author {
    private int id;
    private String surname;
    private String name;
    private String patronymicName;
    private LocalDate dateOfBirth;
    private List<Book> writtenBookList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<Book> getWrittenBookList() {
        return writtenBookList;
    }

    public void setWrittenBookList(List<Book> writtenBookList) {
        this.writtenBookList = writtenBookList;
    }
}