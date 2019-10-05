package com.example.demo.controller;

import com.example.demo.entity.usuario;
import com.example.demo.service.usuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/usuarios")
public class userController {
    @Autowired
    private com.example.demo.service.usuarioService usuarioService;

    @GetMapping("/{id}")
    public usuario obtener(@PathVariable long id){
        return usuarioService.obtener(id);
    }

    @PostMapping("")
    public long insertar(@RequestBody @Valid usuario usuario){
        return usuarioService.insertar(usuario);
    }

    @DeleteMapping("/{id}")
    public boolean eliminar(@PathVariable long id){
       return usuarioService.eliminar(id);
    }

    @PutMapping("/{id}")
    public long modificar(@PathVariable long id, @RequestBody @Valid usuario usuario){
        usuario.setId(id);
        return usuarioService.actualizar(usuario);
    }

}
