package kz.halykacademy.bookstore.DTO;

import java.util.List;

public class Book {
    private double price;
    private List<Author> authorsList;
    private Publisher publisher;
    private String name;
    private int numberOfPages;
    private int yeorOfRelease;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Author> getAuthorsList() {
        return authorsList;
    }

    public void setAuthorsList(List<Author> authorsList) {
        this.authorsList = authorsList;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getYeorOfRelease() {
        return yeorOfRelease;
    }

    public void setYeorOfReelase(int yeorOfRelease) {
        this.yeorOfRelease = yeorOfRelease;
    }

}
