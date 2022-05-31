package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
       Usuario usuario = new Usuario();
       usuario.setId(id);
       usuario.setNombre("Ricardo");
       usuario.setApellido("Delgado");
       usuario.setEmail("dricardo@gmail.com");
       usuario.setTelefono("3122290023");
       usuario.setPassword("contraseña");

       return  usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){

        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setId(22l);
        usuario.setNombre("Ricardo");
        usuario.setApellido("Delgado");
        usuario.setEmail("dricardo@gmail.com");
        usuario.setTelefono("3122290023");
        usuario.setPassword("contraseña");

        Usuario usuario2 = new Usuario();
        usuario2.setId(23l);
        usuario2.setNombre("Ricardo2");
        usuario2.setApellido("Delgado");
        usuario2.setEmail("dricardo@gmail.com");
        usuario2.setTelefono("3122290023");
        usuario2.setPassword("contraseña");

        Usuario usuario3 = new Usuario();
        usuario3.setId(24l);
        usuario3.setNombre("Ricardo3");
        usuario3.setApellido("Delgado");
        usuario3.setEmail("dricardo@gmail.com");
        usuario3.setTelefono("3122290023");
        usuario3.setPassword("contraseña");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return  usuarios;
    }
}
