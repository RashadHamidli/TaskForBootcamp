package com.company.controllers;

import com.company.entities.Book;
import com.company.services.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/book")
public class BookRestController {
    private final BookService bookService;
    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Book> getAllBook(){
        return bookService.getAllBook();
    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Book getBookById(@PathVariable Long id){
        return bookService.getBookById(id);
    }
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Book createBook(@Valid @RequestBody Book book){
        return bookService.createBook(book);
    }
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Book updateBook(@Valid @PathVariable Long id, @RequestBody Book book){
        return bookService.updateBook(id, book);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBookById(@PathVariable Long id){
        bookService.deleteBookById(id);
    }

}
