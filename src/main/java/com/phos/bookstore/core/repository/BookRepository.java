package com.phos.bookstore.core.repository;

import com.phos.bookstore.core.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
