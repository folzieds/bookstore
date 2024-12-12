package com.phos.bookstore.core.service;


import com.phos.bookstore.core.dto.BookDto;
import com.phos.bookstore.core.dto.SearchCriteria;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BookStoreService {

    public Page<BookDto> search(SearchCriteria searchCriteria, Pageable pageable);
}
