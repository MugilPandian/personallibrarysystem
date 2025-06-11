package com.mugilpandian.personallibrarysystem.service;

import com.mugilpandian.personallibrarysystem.entity.Books;

import java.util.List;

public interface BooksService {

    List<Books> fetchBooksList();
}
