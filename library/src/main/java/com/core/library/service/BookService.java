package com.core.library.service;

import com.core.library.model.BookEntity;
import com.core.library.commons.Language;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

/**
 * @author MRegra on 14/09/2023
 */
@Service
public class BookService {

    public BookEntity geAllBooks(){
        return new BookEntity(
                new UUID(1L, 1L),
                "Deep Work",
                "123132123",
                new Date(),
                Language.ENGLISH,
                400,
                "Editor",
                null,//Set.of(Themes.Business, Themes.SelfDevelopment),
                1);
    }
}
