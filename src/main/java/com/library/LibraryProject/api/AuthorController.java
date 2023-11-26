package com.library.LibraryProject.api;

import com.library.LibraryProject.business.concretes.AuthorManager;
import com.library.LibraryProject.entities.Author;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")
public class AuthorController{

    private final AuthorManager authorManager;

    public AuthorController(AuthorManager authorManager) {
        this.authorManager = authorManager;
    }

    @PostMapping("/save")
    public Author save(@RequestBody Author author){
        return this.authorManager.save(author);
    }

    @GetMapping("/{id}")
    public Author findById(@PathVariable("id") long id){
        return this.authorManager.findById(id);
    }
}
