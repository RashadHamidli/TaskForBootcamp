package com.company.dto;

import com.company.entities.Book;

import java.util.Optional;

public class BookRequest {
    public static Book update(Book book, Book foundedBook) {
        Optional.ofNullable(book.getBookName()).ifPresent(foundedBook::setBookName);
        Optional.ofNullable(book.getBookTheme()).ifPresent(foundedBook::setBookTheme);
        Optional.ofNullable(book.getPage()).ifPresent(foundedBook::setPage);
        return foundedBook;
    }
}
