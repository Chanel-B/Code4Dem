package com.user.controller;

import com.user.model.Articles;
import com.user.model.Comments;
import com.user.model.Users;
import com.user.repository.ArticlesRepository;
import com.user.repository.CommentsRepository;
import com.user.repository.UserRepository;
import com.user.services.ArticlesStoreServices;
import com.user.services.CommentsStoreServices;
import com.user.services.UserStoreServices;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
public class dbStoreService {

    @Autowired
    private ArticlesRepository articlesRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CommentsRepository commentsRepository;

    private UserStoreServices userStoreServices;
    private CommentsStoreServices commentsStoreServices;
    private ArticlesStoreServices articlesStoreServices;

    /*article store service*/ //TODO
    @GetMapping("/articles")
    public Collection<Articles> getFindAllArticles() {
        return articlesRepository.findAll();
    }

    @GetMapping("/articles/{id}")
    public Optional<Articles> findArticlesById(@PathVariable("id") int id) {
        return articlesRepository.findById(id);
    }

    @PostMapping("/articles")
    public Articles saveArticles(@RequestBody Articles articles) {
        return articlesRepository.save(articles);
    }

    /*comments store service*/ //TODO
    @GetMapping("/comments")
    public Collection<Comments> getFindAllComments() {
        return commentsRepository.findAll();
    }

    @GetMapping("/comments/{id}")
    public Optional<Comments> findCommentsById(@PathVariable("id") int id) {
        return commentsRepository.findById(id);
    }

    @PostMapping("/comments")
    public Comments saveComments(@RequestBody Comments comments) {
        return commentsRepository.save(comments);
    }

    /*user store service*/ //TODO
    @GetMapping("/users")
    public Collection<Users> getFindAllUser() {
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    public Optional<Users> findUserById(@PathVariable("id") int id) {
        return userRepository.findById(id);
    }

    @PostMapping("/user")
    public Users saveUser(@RequestBody Users user) {
        return userRepository.save(user);
    }

    @PutMapping("/user/{id}")
    public String updateUser(@RequestBody Users newUser, @PathVariable("id") int id) {
        return userStoreServices.updateUser(newUser, id);
    }

    @DeleteMapping("/user/{id}")
    public String deleteUserById(@PathVariable("id") int id) {
        return userStoreServices.deleteUser(id);
    }

}

