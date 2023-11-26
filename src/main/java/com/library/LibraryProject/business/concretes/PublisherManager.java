package com.library.LibraryProject.business.concretes;

import com.library.LibraryProject.business.abstracts.IPublisherService;
import com.library.LibraryProject.dao.PublisherRepository;
import com.library.LibraryProject.entities.Publisher;
import org.springframework.stereotype.Service;

@Service
public class PublisherManager implements IPublisherService {

    private final PublisherRepository publisherRepository;

    public PublisherManager(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public Publisher findById(long id) {
        return this.publisherRepository.findById(id).orElseThrow();
    }

    @Override
    public Publisher save(Publisher publisher) {
        return this.publisherRepository.save(publisher);
    }

    @Override
    public void delete(Publisher publisher) {

    }

    @Override
    public Publisher update(Publisher publisher) {
        return null;
    }
}
