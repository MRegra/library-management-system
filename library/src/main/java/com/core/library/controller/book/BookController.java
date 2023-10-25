package com.core.library.controller.book;

import com.core.library.entities.BookEntity;
import com.core.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MRegra on 14/09/2023
 */
@RestController
@RequestMapping(path = "api/v1/book")
public class BookController {

    // Autowired is dependency injection. It will automatically instantiated by us.
    // BookService has to be a Bean for this. In this case it is @Service.
    @Autowired
    private BookService bookService;

    @GetMapping
    public BookEntity geAllBooks(){
        return bookService.geAllBooks();
    }
}
