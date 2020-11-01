package com.projeto2;

import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    public boolean verificaMaiorIdade(int idade){
        return idade >= 18 ? true:false;
    }

}
