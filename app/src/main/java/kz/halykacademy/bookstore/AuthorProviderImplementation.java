package kz.halykacademy.bookstore;

import java.util.List;

public class AuthorProviderImplementation implements AuthorProvider{
    public static List<Author> authorList;

    @Override
    public List<Author> getAll(){
        return authorList;
    }
}
