package com.ll.basic1.boundedContext.article.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //mysql에 atuo_incrrement 기능
    private long id;
    private LocalDate createDate;
    private LocalDate modifyDate;
    private String title;
    private String body;
}