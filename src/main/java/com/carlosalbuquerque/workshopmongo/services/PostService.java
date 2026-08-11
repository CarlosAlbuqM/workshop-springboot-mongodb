package com.carlosalbuquerque.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlosalbuquerque.workshopmongo.domain.Post;
import com.carlosalbuquerque.workshopmongo.repository.PostRepository;
import com.carlosalbuquerque.workshopmongo.services.service.exception.ObjectNotFoundException;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
    Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
}

public List<Post> findByTitle(String text) {
    return repo.searchTitle(text);
}

}