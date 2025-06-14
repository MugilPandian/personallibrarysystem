package com.mugilpandian.personallibrarysystem.entity;

import jakarta.persistence.*;
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
    @Column(name = "authorid")
    private Long AuthorID;

    @Column(name = "authorname")
    private String AuthorName;
    private String Country;
}
