package com.wavekeeper.api.api_wavekeeper.controller;

import org.springframework.web.bind.annotation.RestController;

import com.wavekeeper.api.api_wavekeeper.entity.Usuario;
import com.wavekeeper.api.api_wavekeeper.service.UsuarioService;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;



@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/")
    public List<Usuario> procurarUsuarios() {
        return usuarioService.procurarUsuarios();
    }

    @PostMapping("/")
    public Usuario insert(@RequestBody Usuario usuario){
        return usuarioService.insert(usuario);
    }
    
    @PutMapping("/")
    public Usuario update(@RequestBody Usuario usuario){
        return usuarioService.update(usuario);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id){
        usuarioService.delete(id);
    }
}
