package com.driver.RequestDto;

import lombok.*;

import javax.persistence.Column;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthorRequestDto {
    private String name;
    private int age;
    private String country;

    @Column(unique = true)
    private String email;
}
