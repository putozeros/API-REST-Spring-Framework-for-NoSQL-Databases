package com.apimongodb.service;

import com.apimongodb.model.Usuario;
import com.apimongodb.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImp implements UsuarioService{

    UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioServiceImp(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    @Override
    public void save (Usuario usuario) {
        usuarioRepository.save(usuario);
    }
    @Override
    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }
    @Override
    public Optional <Usuario> findById(String id){
        return usuarioRepository.findById(id);
    }
    @Override
    public void deleteById(String id){
        usuarioRepository.deleteById(id);
    }

}
