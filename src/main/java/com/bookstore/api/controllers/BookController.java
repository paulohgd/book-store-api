package com.bookstore.api.controllers;
import com.bookstore.api.domain.Book;
import com.bookstore.api.feign.BookClient;
import com.bookstore.api.services.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping()
    public String getBooks(){
        List<Book> books = this.service.getBooksFromLibrary();
        return "Oi";
    }

}
