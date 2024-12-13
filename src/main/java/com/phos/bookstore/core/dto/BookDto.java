package com.phos.bookstore.core.dto;

import com.phos.bookstore.core.model.Genre;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class BookDto {
    private Long id;
    private String title;
    private String author;
    private Genre genre;
    private Integer publicationYear;
    private String isbn;

}
