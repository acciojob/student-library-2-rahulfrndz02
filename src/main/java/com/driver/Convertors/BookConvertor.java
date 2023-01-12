package com.driver.Convertors;

import com.driver.models.Book;
import com.driver.RequestDto.BookRequestDto;

public class BookConvertor {

    public static Book convertBookDtoToEntity(BookRequestDto bookRequestDto){
        Book book = Book.builder().
                name(bookRequestDto.getName()).
                genre(bookRequestDto.getGenre()).build();
        return book;
    }
}
