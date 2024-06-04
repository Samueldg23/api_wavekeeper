package com.wavekeeper.api.api_wavekeeper.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wavekeeper.api.api_wavekeeper.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
