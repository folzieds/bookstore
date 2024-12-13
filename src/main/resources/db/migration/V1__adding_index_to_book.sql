-- Adding index to book table
CREATE INDEX idx_books_author_title_genre_year ON book(author, title, genre, publication_year);
