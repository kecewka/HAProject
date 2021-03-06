package kz.halykacademy.bookstore.DTO;

import java.time.LocalDate;
import java.util.List;

public class Author {

    private String surname;
    private String name;
    private String patronymicName;
    private LocalDate dateOfBirth;
    private List<Book> writtenBooksList;

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

    public List<Book> getWrittenBooksList() {
        return writtenBooksList;
    }

    public void setWrittenBooksList(List<Book> writtenBooksList) {
        this.writtenBooksList = writtenBooksList;
    }
}
