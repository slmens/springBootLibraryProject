package com.library.LibraryProject.api;

import com.library.LibraryProject.business.concretes.CategoryManager;
import com.library.LibraryProject.entities.Category;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private final CategoryManager categoryManager;

    public CategoryController(CategoryManager categoryManager) {
        this.categoryManager = categoryManager;
    }

    @GetMapping("/{id}")
    public Category getById(@PathVariable("id") int id){
        return this.categoryManager.getById(id);
    }


}
