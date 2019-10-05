package com.example.demo.service;

import com.example.demo.entity.usuario;
import com.example.demo.repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("usuarioService")
public class usuarioService {
    @Autowired
    @Qualifier("usuarioRepo")
    private userRepo userRepo;

    public long insertar(usuario usuario){
       return userRepo.saveAndFlush(usuario).getId();
    }

    public usuario obtener(long id){
        return userRepo.findById(id);
    }

    public long actualizar(usuario usuario){
        return userRepo.saveAndFlush(usuario).getId();
    }
    public boolean eliminar(long id){
        userRepo.deleteById(id);
        return true;
    }


}
