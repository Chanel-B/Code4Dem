package com.user.services;

import com.user.model.Articles;
import com.user.model.Comments;
import com.user.repository.ArticlesRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.Optional;

public class ArticlesStoreServices {
    @Autowired
    private ArticlesRepository articlesRepository;

    //TODO GET ALL articles
    public Collection<Articles> findAllArticles() {
        return articlesRepository.findAll();
    }

    //TODO RETRIEVE A articles BY ID
    public Optional<Articles> findArticlesById(int id) {
        return articlesRepository.findById(id);
    }

    public Articles saveArticles(Articles articles) {
        return articlesRepository.save(articles);
    }


    //TODO SAVE articles

    //TODO UPDATE articles
    //TODO DELETE articles
}
