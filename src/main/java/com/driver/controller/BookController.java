package com.driver.controller;

import com.driver.RequestDto.AuthorRequestDto;
import com.driver.models.Book;
import com.driver.repositories.AuthorRepository;
import com.driver.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Add required annotations
@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    BookService bookService;
    @Autowired
    private AuthorRepository authorRepository;

    //Write createBook API with required annotations
    @PostMapping("/create_book")
    public ResponseEntity<String> createBook(@RequestBody() Book book){
        bookService.createBook(book);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }

    //Add required annotations
    @GetMapping("/get_book/{genre}{available}{author}")
    public ResponseEntity getBooks(@RequestParam(value = "genre", required = false) String genre,
                                   @RequestParam(value = "available", required = false, defaultValue = "false") boolean available,
                                   @RequestParam(value = "author", required = false) String author){

        List<Book> bookList = null; //find the elements of the list by yourself
        bookList = bookService.getBooks(genre, available, author);

        return new ResponseEntity<>(bookList, HttpStatus.OK);
    }
}
