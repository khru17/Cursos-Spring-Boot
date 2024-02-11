package com.example.arquitecturamulticapas.repository;

import com.example.arquitecturamulticapas.model.Posteo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PosteoRepository implements  IPosteoRepository{
    @Override
    public List<Posteo> traerTodos() {
        List<Posteo> listaPosteos = new ArrayList<Posteo>();
        listaPosteos.add(new Posteo(1L, "¿Cómo formatear una PC?", "khru"));
        listaPosteos.add(new Posteo(2L, "¿Cómo mantener la seguridad?", "Juan"));
        return listaPosteos;
    }
}
