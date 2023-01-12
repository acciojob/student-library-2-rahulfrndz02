package com.driver.ResponseDto;

import com.driver.models.Genre;
import lombok.*;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookResponseDto {
    private String name;
    private Genre genre;
}
