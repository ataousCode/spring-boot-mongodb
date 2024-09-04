package com.almousleck.book;

import java.util.List;

public interface BookService {
    List<Book> getBooks();
    Book getBookById(String bookId);
    Book createBook(Book book);
    Book updateBook(Book book, String bookId);
    void deleteBook(String bookId);
}
