package com.example.bookstorespring.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;


@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookDTO {
    long id;
    String name;
    double price;
    int stock;
    List<AuthorDTO> authorList;
    List<GenreDTO> genreList;


}
