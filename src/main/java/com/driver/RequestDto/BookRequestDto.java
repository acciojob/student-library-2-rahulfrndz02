package com.driver.RequestDto;

import com.driver.models.Genre;
import lombok.Builder;
import lombok.Data;

@Data
public class BookRequestDto {
    private String name;
    private Genre genre;

    private int authorId;
}
