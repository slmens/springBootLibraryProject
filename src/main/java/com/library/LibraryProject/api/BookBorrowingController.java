package com.library.LibraryProject.api;

import com.library.LibraryProject.business.concretes.BookBorrowingManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/borrowing")
public class BookBorrowingController {

    private final BookBorrowingManager bookBorrowingManager;

    public BookBorrowingController(BookBorrowingManager bookBorrowingManager) {
        this.bookBorrowingManager = bookBorrowingManager;
    }
}
