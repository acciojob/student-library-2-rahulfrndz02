package com.driver.services;

import com.driver.Convertors.AuthorConvertor;
import com.driver.RequestDto.AuthorRequestDto;
import com.driver.models.Author;
import com.driver.repositories.AuthorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository1;

    public String create(AuthorRequestDto authorRequestDto){
        try {
            Author author = AuthorConvertor.convertAuthorDtoToEntity(authorRequestDto);
            authorRepository1.save(author);
        }
        catch (Exception e){
            log.info("createAuthor has caused an error");
            return "Create author didn't work";
        }
        return "Author created successfully";
    }
}
