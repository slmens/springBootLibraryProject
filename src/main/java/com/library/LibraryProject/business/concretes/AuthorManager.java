package com.library.LibraryProject.business.concretes;

import com.library.LibraryProject.business.abstracts.IAuthorService;
import com.library.LibraryProject.dao.AuthorRepository;
import com.library.LibraryProject.entities.Author;
import org.springframework.stereotype.Service;

@Service
public class AuthorManager implements IAuthorService {

    private final AuthorRepository authorRepository;

    public AuthorManager(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Author getById(int id) {
        return null;
    }

    @Override
    public Author save(Author author) {
        return null;
    }

    @Override
    public void delete(Author author) {

    }

    @Override
    public Author update(Author author) {
        return null;
    }
}
