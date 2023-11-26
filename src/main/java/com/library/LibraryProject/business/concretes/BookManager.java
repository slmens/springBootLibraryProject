package com.library.LibraryProject.business.concretes;

import com.library.LibraryProject.DTO.requestDto.BookSaveDTO;
import com.library.LibraryProject.business.abstracts.IBookService;
import com.library.LibraryProject.dao.BookRepository;
import com.library.LibraryProject.entities.Book;
import com.library.LibraryProject.entities.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookManager implements IBookService {

    private final CategoryManager categoryManager;
    private final PublisherManager publisherManager;
    private final AuthorManager authorManager;
    private final BookRepository bookRepository;

    public BookManager(CategoryManager categoryManager, PublisherManager publisherManager, AuthorManager authorManager, BookRepository bookRepository) {
        this.categoryManager = categoryManager;
        this.publisherManager = publisherManager;
        this.authorManager = authorManager;
        this.bookRepository = bookRepository;
    }

    @Override
    public Book findById(long id) {
        return this.bookRepository.findById(id).orElseThrow();
    }

    @Override
    public Book save(BookSaveDTO bookSaveDTO) {
        List<Category> categoryList = new ArrayList<>();
        bookSaveDTO.getCategory_ids().stream().map(item -> categoryList.add(this.categoryManager.findById(item)));

        Book book = new Book();
        book.setName(bookSaveDTO.getName());
        book.setAuthor(this.authorManager.findById(bookSaveDTO.getAuthor_id()));
        book.setStock(bookSaveDTO.getStock());
        book.setPublisher(this.publisherManager.findById(bookSaveDTO.getPublisher_id()));
        book.setCategoryList(categoryList);
        book.setPublicationYear(bookSaveDTO.getPublicationYear());

        return this.bookRepository.save(book);
    }

    @Override
    public void delete(Book book) {

    }

    @Override
    public Book update(Book book) {
        return null;
    }
}
