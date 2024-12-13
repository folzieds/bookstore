package com.phos.bookstore.core.repository;

import com.phos.bookstore.core.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookRepository extends JpaRepository<Book, Long> {

    @Query("Select b from Book b where b.author = :author or b.title = :title or b.genre = :genre or b.publicationYear = :year")
    Page<Book> findBySearchParameter(String author, String title, String genre, Integer year, Pageable pageable);
}
