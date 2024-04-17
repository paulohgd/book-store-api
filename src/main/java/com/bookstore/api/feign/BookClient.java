package com.bookstore.api.feign;
import com.bookstore.api.domain.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "book-api", url = "https://books-on-my-library.s3.amazonaws.com/books.json")
public interface BookClient {

    @GetMapping("/books.json")
    List<Book> getBooks();
}
