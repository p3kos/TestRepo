package com.example.demo.repository;

import com.example.demo.entity.usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("usuarioRepo")
public interface userRepo extends JpaRepository<usuario,Long> {
    usuario findById(long id);
    List<usuario> findAll();

}
