package com.mugilpandian.personallibrarysystem.service.impl;

import com.mugilpandian.personallibrarysystem.repository.BooksRepository;
import com.mugilpandian.personallibrarysystem.entity.Books;
import com.mugilpandian.personallibrarysystem.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksServiceImpl
    implements BooksService {

    @Autowired
    private BooksRepository booksRepository;

    @Override
    public List<Books> fetchBooksList(){
        return (List<Books>) booksRepository.findAll();
    }

}
