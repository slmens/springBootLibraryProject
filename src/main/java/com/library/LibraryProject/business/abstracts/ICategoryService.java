package com.library.LibraryProject.business.abstracts;

import com.library.LibraryProject.entities.Category;

public interface ICategoryService {
    Category getById(int id);
    Category save(Category category);
    void delete(Category category);
    Category update(Category category);
}
