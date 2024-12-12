package com.phos.bookstore.core.dto;

import com.phos.bookstore.core.model.Genre;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
public class BookDto {
    private Long id;
    private String title;
    private String author;
    private Genre genre;
    private LocalDate publicationYear;
    private String isbn;

}
