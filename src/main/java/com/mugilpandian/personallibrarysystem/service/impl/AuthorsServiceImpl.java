package com.mugilpandian.personallibrarysystem.service.impl;

import com.mugilpandian.personallibrarysystem.entity.Authors;
import com.mugilpandian.personallibrarysystem.repository.AuthorsRepository;
import com.mugilpandian.personallibrarysystem.service.AuthorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorsServiceImpl implements AuthorsService {
    @Autowired
    private AuthorsRepository authorsRepository;
    @Override
    public List<Authors> fetchAuthorsList(){
        return (List<Authors>) authorsRepository.findAll();
    }
}
