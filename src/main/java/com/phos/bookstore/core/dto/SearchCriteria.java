package com.phos.bookstore.core.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SearchCriteria {

    private String title;
    private String author;
    private String genre;
    private Integer publicationYear;
}
