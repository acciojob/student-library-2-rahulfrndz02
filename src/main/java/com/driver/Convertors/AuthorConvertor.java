package com.driver.Convertors;

import com.driver.RequestDto.AuthorRequestDto;
import com.driver.models.Author;
import com.driver.repositories.AuthorRepository;

public class AuthorConvertor {

    public static Author convertAuthorDtoToEntity(AuthorRequestDto authorRequestDto){
        Author author = Author.builder().
                name(authorRequestDto.getName()).
                age(authorRequestDto.getAge()).
                email(authorRequestDto.getEmail()).
                country(authorRequestDto.getCountry()).build();
        return author;
    }
}
