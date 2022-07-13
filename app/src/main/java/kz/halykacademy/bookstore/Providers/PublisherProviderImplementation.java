package kz.halykacademy.bookstore.Providers;

import kz.halykacademy.bookstore.DTO.Publisher;

import java.util.ArrayList;
import java.util.List;

public class PublisherProviderImplementation implements PublisherProvider{
    private static List<Publisher> publisherList = new ArrayList<>();

    @Override
    public List<Publisher> getAll() {
        return publisherList;
    }
}
