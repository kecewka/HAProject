package kz.halykacademy.bookstore;

import java.util.List;

public class PublisherProviderImplementation implements PublisherProvider{
    private static List<Publisher> publisherList;

    @Override
    public List<Publisher> getAll() {
        return publisherList;
    }
}
