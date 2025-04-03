package com.example.safety.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.safety.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	Usuario findByEmail(String email);	

}
