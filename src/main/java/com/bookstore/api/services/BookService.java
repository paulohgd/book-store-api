package com.bookstore.api.services;

import com.bookstore.api.domain.Book;
import com.bookstore.api.feign.BookClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookClient bookClient;

    public BookService(BookClient client) {
        this.bookClient = client;
    }

    public List<Book> getBooksFromLibrary(){
        return this.bookClient.getBooks();
    }
}
