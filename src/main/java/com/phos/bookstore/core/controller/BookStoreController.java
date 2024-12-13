package com.phos.bookstore.core.controller;

import com.phos.bookstore.core.dto.BookDto;
import com.phos.bookstore.core.dto.SearchCriteria;
import com.phos.bookstore.core.service.BookStoreService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/book-inventory")
public class BookStoreController {

    private final BookStoreService bookStoreService;

    public BookStoreController(BookStoreService bookStoreService) {
        this.bookStoreService = bookStoreService;
    }

    @GetMapping("/search")
    public ResponseEntity<Page<BookDto>> searchBooks(
            @RequestParam(required = false) String author,
            @RequestParam(required = false) String title,
            @RequestParam(required = false) String genre,
            @RequestParam(required = false) Integer year,
            Pageable pageable) {

        SearchCriteria criteria = SearchCriteria.builder()
                                                .author(author)
                                                .title(title)
                                                .genre(genre)
                                                .publicationYear(year)
                                                .build();

        return ResponseEntity.ok(bookStoreService.search(criteria,pageable));
    }

}
