package com.library.LibraryProject.api;

import com.library.LibraryProject.DTO.requestDto.BookBorrowingSaveDTO;
import com.library.LibraryProject.DTO.requestDto.BookBorrowingUpdateDTO;
import com.library.LibraryProject.business.concretes.BookBorrowingManager;
import com.library.LibraryProject.business.concretes.BookManager;
import com.library.LibraryProject.entities.BookBorrowing;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/borrowing")
public class BookBorrowingController {

    private final BookBorrowingManager bookBorrowingManager;

    @Autowired
    private final ModelMapper modelMapper;

    public BookBorrowingController(BookBorrowingManager bookBorrowingManager, ModelMapper modelMapper) {
        this.bookBorrowingManager = bookBorrowingManager;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/{id}")
    public BookBorrowing findById(@PathVariable("id") long id){
        return this.bookBorrowingManager.findById(id);
    }

    @PostMapping("/save")
    public BookBorrowing save(@RequestBody BookBorrowingSaveDTO bookBorrowingSaveDTO){

        return this.bookBorrowingManager.save(bookBorrowingSaveDTO);
    }

    @PutMapping("/{id}")
    public BookBorrowingUpdateDTO update(@RequestBody BookBorrowing bookBorrowing, @PathVariable("id") long id){
        return this.modelMapper.map(this.bookBorrowingManager.update(bookBorrowing),BookBorrowingUpdateDTO.class);
    }
}
