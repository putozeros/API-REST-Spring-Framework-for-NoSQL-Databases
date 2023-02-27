package com.apimongodb.controller;

import com.apimongodb.model.Usuario;
import com.apimongodb.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UsuarioController {

    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService=usuarioService;
    }

    @PostMapping("/usuarios")
    public void save(@RequestBody Usuario usuario){
        usuarioService.save(usuario);
    }

    @GetMapping("/usuarios")
    public List<Usuario> findAll(){
        return usuarioService.findAll();
    }

    @GetMapping("/usuario/{id}")
    public Usuario findById(@PathVariable String id){
        return usuarioService.findById(id).get();
    }

    @DeleteMapping("/usuario/{id}")
    public void deleteById(@PathVariable String id){
        usuarioService.deleteById(id);
    }

    @PutMapping("/usuarios")
    public void update(@RequestBody Usuario usuario){
        usuarioService.save(usuario);
    }

}
