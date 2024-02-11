package com.example.arquitecturamulticapas.controller;

import com.example.arquitecturamulticapas.model.Posteo;
import com.example.arquitecturamulticapas.repository.IPosteoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class aplicationController {

    // Inyectando el IPosteoRepository
    @Autowired
    IPosteoRepository repo;

    @GetMapping("/posteos")
    public List<Posteo> traerTodos() {

        return repo.traerTodos();
    }
}
