package com.library.LibraryProject.business.concretes;

import com.library.LibraryProject.business.abstracts.ICategoryService;
import com.library.LibraryProject.dao.CategoryRepository;
import com.library.LibraryProject.entities.Category;
import org.springframework.stereotype.Service;

@Service
public class CategoryManager implements ICategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryManager(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category findById(long id) {
        return this.categoryRepository.findById(id).orElseThrow();
    }

    @Override
    public Category save(Category category) {
        return this.categoryRepository.save(category);
    }

    @Override
    public void delete(Category category) {
        //if (//bu kategoriye ait kitap varsa runtime ex at)
        this.categoryRepository.delete(category);
    }

    @Override
    public Category update(Category category) {
        if (category.getId() <= 0){
            throw new RuntimeException("Lütfen id'yi doğru giriniz!");
        }
        return this.categoryRepository.save(category);
    }
}
