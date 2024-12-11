package com.phos.bookstore.core.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class BookDto {
    private Long id;
    private String title;
    private String author;
    private String isbn;

}
