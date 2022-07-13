package kz.halykacademy.bookstore.Providers;

import kz.halykacademy.bookstore.DTO.Book;

import java.util.ArrayList;
import java.util.List;

public class BookProviderImplementation implements BookProvider{
    private static List<Book> bookList = new ArrayList<>();

    @Override
    public List<Book> getAll(){
        return bookList;
    }
}
