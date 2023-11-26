package com.library.LibraryProject.api;

import com.library.LibraryProject.DTO.responseDto.PublisherGetResponseDTO;
import com.library.LibraryProject.business.concretes.PublisherManager;
import com.library.LibraryProject.entities.Publisher;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/publisher")
public class PublisherController {

    private final PublisherManager publisherManager;

    @Autowired
    private final ModelMapper modelMapper;

    public PublisherController(PublisherManager publisherManager, ModelMapper modelMapper) {
        this.publisherManager = publisherManager;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/{id}")
    public PublisherGetResponseDTO findById(@PathVariable("id") long id){
        return this.modelMapper.map(this.publisherManager.findById(id),PublisherGetResponseDTO.class);
    }

    @PostMapping("/save")
    public Publisher save(@RequestBody Publisher publisher){
        return this.publisherManager.save(publisher);
    }
}
