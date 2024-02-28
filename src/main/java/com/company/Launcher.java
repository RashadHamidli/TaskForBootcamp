package com.company;

import com.company.controllers.BookRestController;
import com.company.entities.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Launcher {

    public static void main(String[] args) {
        SpringApplication.run(Launcher.class, args);
    }

//    @Bean
//    public CommandLineRunner runner(BookRestController bookRestController) {
//        return args -> {
//            Book book = new Book();
//            book.setBookName("Jdk 21");
//            book.setBookTheme("this book for Java Developer");
//            book.setPage(236);
//            Book createBook = bookRestController.createBook(book);
//            System.out.println(createBook);
//        };
//    }

}
