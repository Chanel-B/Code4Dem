package com.user.services;

import com.user.model.Comments;
import com.user.repository.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.Optional;

public class CommentsStoreServices {

    @Autowired
    private CommentsRepository commentsRepository;

    //TODO GET ALL
    public Collection<Comments> findAllComments() {
        return commentsRepository.findAll();
    }

    //TODO RETRIEVE A COMMENT BY ID
    public Optional<Comments> findCommentsById(int id) {
        return commentsRepository.findById(id);
    }

    //TODO SAVE COMMENT
    public Comments saveComments(Comments comments) {
        return commentsRepository.save(comments);
    }





    //TODO UPDATE COMMENT

    //TODO DELETE COMMENT

}
