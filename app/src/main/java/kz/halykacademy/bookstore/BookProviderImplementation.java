package kz.halykacademy.bookstore;

import java.util.List;

public class BookProviderImplementation implements BookProvider{
    private static List<Book> bookList;

    @Override
    public List<Book> getAll(){
        return bookList;
    }
}
