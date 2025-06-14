package com.mugilpandian.personallibrarysystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Authors {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long AuthorID;
    private String AuthorName;
    private String Country;
}
