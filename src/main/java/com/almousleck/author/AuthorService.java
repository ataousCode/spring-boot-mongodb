package com.almousleck.author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    Author createAuthor(Author author);
    Optional<Author> findAuthorById(String authorId);
    List<Author> findAllAuthors();
    void deleteAuthor(String authorId);
}
