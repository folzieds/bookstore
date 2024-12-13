package com.phos.bookstore.core.service.impl;

import com.phos.bookstore.core.dto.BookDto;
import com.phos.bookstore.core.dto.SearchCriteria;
import com.phos.bookstore.core.model.Book;
import com.phos.bookstore.core.repository.BookRepository;
import com.phos.bookstore.core.service.BookStoreService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BookStoreServiceImpl implements BookStoreService {

    private final BookRepository bookRepository;

    public BookStoreServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public Page<BookDto> search(SearchCriteria searchCriteria, Pageable pageable) {
        return bookRepository
                .findBySearchParameter(searchCriteria.getAuthor(), searchCriteria.getTitle(), searchCriteria.getGenre(), searchCriteria.getPublicationYear(), pageable)
                .map(this::convertBookToBookDto);
    }

    private BookDto convertBookToBookDto(Book book) {
        return BookDto.builder()
                .id(book.getId())
                .title(book.getTitle())
                .author(book.getAuthor())
                .genre(book.getGenre())
                .isbn(book.getIsbn())
                .publicationYear(book.getPublicationYear())
                 .build();
    }
}
