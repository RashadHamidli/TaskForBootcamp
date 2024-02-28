package com.company.services;

import com.company.dto.BookRequest;
import com.company.entities.Book;
import com.company.repository.BookRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    @Transactional
    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    @Transactional(Transactional.TxType.SUPPORTS)
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("book not found"));
    }

    @Transactional
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @Transactional
    public Book updateBook(@Valid Long id, Book book) {
        Book foundedBook = getBookById(id);
        return bookRepository.save(BookRequest.update(book, foundedBook));
    }

    @Transactional
    public void deleteBookById(Long id) {
        Book book = getBookById(id);
        bookRepository.delete(book);
    }
}
