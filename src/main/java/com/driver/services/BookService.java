package com.driver.services;

import com.driver.Convertors.AuthorConvertor;
import com.driver.models.Author;
import com.driver.models.Book;
import com.driver.repositories.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BookService {


    @Autowired
    BookRepository bookRepository2;

    public void createBook(Book book){
        try {
           //Book book = BookConvertor.convertBookDtoToEntity(bookRequestDto);
            bookRepository2.save(book);
        }
        catch (Exception e){
            log.info("createAuthor has caused an error");
            System.out.println("Create author didn't work");
        }
        System.out.println("Author created successfully");

    }

    public List<Book> getBooks(String genre, boolean available, String author){
        List<Book> books = null; //find the elements of the list by yourself
        return books;
    }
}
