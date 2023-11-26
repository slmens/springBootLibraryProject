package com.library.LibraryProject.business.abstracts;

import com.library.LibraryProject.entities.Author;
import com.library.LibraryProject.entities.Category;

public interface IAuthorService {
    Author findById (long id);
    Author save(Author author);
    void delete(Author author);
    Author update(Author author);
}
