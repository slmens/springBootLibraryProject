package com.library.LibraryProject.api;

import com.library.LibraryProject.DTO.requestDto.BookSaveDTO;
import com.library.LibraryProject.business.concretes.BookManager;
import com.library.LibraryProject.entities.Book;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    private final BookManager bookManager;

    public BookController(BookManager bookManager) {
        this.bookManager = bookManager;
    }

    // save get

    @GetMapping("/{id}")
    public Book findById(@PathVariable("id") long id){
        return this.bookManager.findById(id);
    }

    @PostMapping("/save")
    public Book save(@RequestBody BookSaveDTO bookSaveDTO){
        return this.bookManager.save(bookSaveDTO);
    }
}
