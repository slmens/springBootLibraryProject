package com.library.LibraryProject.business.concretes;

import com.library.LibraryProject.DTO.requestDto.BookBorrowingSaveDTO;
import com.library.LibraryProject.business.abstracts.IBookBorrowingService;
import com.library.LibraryProject.dao.BookBorrowingRepository;
import com.library.LibraryProject.entities.BookBorrowing;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BookBorrowingManager implements IBookBorrowingService {

    private final BookManager bookManager;
    private final BookBorrowingRepository bookBorrowingRepository;

    public BookBorrowingManager(BookManager bookManager, BookBorrowingRepository bookBorrowingRepository) {
        this.bookManager = bookManager;
        this.bookBorrowingRepository = bookBorrowingRepository;
    }

    @Override
    public BookBorrowing findById(long id) {
        return this.bookBorrowingRepository.findById(id).orElseThrow();
    }

    @Override
    public BookBorrowing save(BookBorrowingSaveDTO bookBorrowingSaveDTO) {

        if (this.bookManager.findById(bookBorrowingSaveDTO.getBookId()).getStock() > 0){
            System.out.println("girdi");
            BookBorrowing bookBorrowing = new BookBorrowing();
            bookBorrowing.setBook(this.bookManager.findById(bookBorrowingSaveDTO.getBookId()));
            bookBorrowing.setBorrowerName(bookBorrowingSaveDTO.getBorrowerName());
            bookBorrowing.setBorrowerEmail(bookBorrowingSaveDTO.getBorrowerEmail());
            bookBorrowing.setBorrowingDate(bookBorrowingSaveDTO.getBorrowingDate());
            return this.bookBorrowingRepository.save(bookBorrowing);
        }
        System.out.println("çıktı");
        return null;
    }

    @Override
    public void delete(BookBorrowing bookBorrowing) {

    }

    @Override
    public BookBorrowing update(BookBorrowing bookBorrowing) {
        return this.bookBorrowingRepository.save(bookBorrowing);
    }
}
