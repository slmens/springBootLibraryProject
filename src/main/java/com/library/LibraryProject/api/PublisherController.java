package com.library.LibraryProject.api;

import com.library.LibraryProject.business.concretes.PublisherManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publisher")
public class PublisherController {

    private final PublisherManager publisherManager;

    public PublisherController(PublisherManager publisherManager) {
        this.publisherManager = publisherManager;
    }
}
