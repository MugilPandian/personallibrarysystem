package com.mugilpandian.personallibrarysystem.controller;

import com.mugilpandian.personallibrarysystem.entity.Authors;
import com.mugilpandian.personallibrarysystem.service.AuthorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorsController {
    @Autowired
    private AuthorsService authorsService;
    @GetMapping("/fetchAllAuthors")
    public List<Authors> fetchAllAuthors(){
        return authorsService.fetchAuthorsList();
    }
}
