package com.mugilpandian.personallibrarysystem.repository;

import com.mugilpandian.personallibrarysystem.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository
    extends JpaRepository<Books, Long> {
}
