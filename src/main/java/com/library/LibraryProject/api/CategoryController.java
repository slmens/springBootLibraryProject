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
    public Category findById(@PathVariable("id") long id){
        return this.categoryManager.findById(id);
    }

    @PostMapping("/save")
    public Category save(@RequestBody Category category){
        return this.categoryManager.save(category);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") long id){
        Category category = findById(id);
        if (category.getBookList().isEmpty()){
            this.categoryManager.delete(category);
            return true;
        }
        return false;
    }
}
