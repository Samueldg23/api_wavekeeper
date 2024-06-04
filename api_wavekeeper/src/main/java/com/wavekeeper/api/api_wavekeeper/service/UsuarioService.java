package com.wavekeeper.api.api_wavekeeper.service;

import java.util.List;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wavekeeper.api.api_wavekeeper.entity.Usuario;
import com.wavekeeper.api.api_wavekeeper.repository.UsuarioRepository;


@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> procurarUsuarios() {
        return usuarioRepository.findAll();
    }
    
    public Usuario insert(Usuario usuario){
       usuario.setDataCriacao(new Date());
       return usuarioRepository.save(usuario);
    }

    public Usuario update(Usuario usuario){
        usuario.setDataUpdate(new Date());
        return usuarioRepository.save(usuario);
    }

    public void delete(Long id){
        usuarioRepository.deleteById(id);
    }


}
