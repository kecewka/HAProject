package kz.halykacademy.bookstore.Providers;

import kz.halykacademy.bookstore.DTO.Author;

import java.util.ArrayList;
import java.util.List;

public class AuthorProviderImplementation implements AuthorProvider{
    private static List<Author> authorList = new ArrayList<>();

    @Override
    public List<Author> getAll(){
        return authorList;
    }
}
