package com.apimongodb.service;

import com.apimongodb.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    public void save (Usuario usuario);
    public List<Usuario> findAll();
    public Optional<Usuario> findById(String id);
    public void deleteById(String id);
}