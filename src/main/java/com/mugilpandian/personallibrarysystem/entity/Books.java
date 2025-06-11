package com.mugilpandian.personallibrarysystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookID;
    private String title;
    private String ISBN;
    private Long authorID;
    private Long genreID;

    @Column(name = "totpages")
    private Long totPages;
    private String synopsis;

    @Column(name = "releaseddate")
    private Date releasedDate;

    @Column(name = "purchaseddate")
    private Date purchasedDate;
    private Long publisherID;

}
