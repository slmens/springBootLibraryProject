package com.library.LibraryProject.api;

import com.library.LibraryProject.business.concretes.BookManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    private final BookManager bookManager;

    public BookController(BookManager bookManager) {
        this.bookManager = bookManager;
    }
}
