package com.mugilpandian.personallibrarysystem.controller;

import com.mugilpandian.personallibrarysystem.entity.Books;
import com.mugilpandian.personallibrarysystem.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BooksController {

    @Autowired
    private BooksService booksService;

    @GetMapping("/fetchAllBooks")
    public List<Books> fetchAllBooks(){
        return booksService.fetchBooksList();
    }

}
