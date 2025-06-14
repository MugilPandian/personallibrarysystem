package com.mugilpandian.personallibrarysystem.repository;

import com.mugilpandian.personallibrarysystem.entity.Authors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorsRepository
    extends JpaRepository<Authors, Long>{
}
