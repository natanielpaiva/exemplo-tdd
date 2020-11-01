package com.projeto2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @GetMapping
    public List<Usuario> listaUsuario() {
        return Arrays.asList(Usuario.builder().
                nome("Nataniel")
                .email("nataniel.paiva@gmail.com")
                .idade(29).build());
    }

}
