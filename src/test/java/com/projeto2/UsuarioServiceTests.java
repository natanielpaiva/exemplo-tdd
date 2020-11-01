package com.projeto2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UsuarioServiceTests {

    @InjectMocks
    public UsuarioService usuarioService;

    @Test
    public void verificaMaiorIdade() {
        Boolean teste = usuarioService.verificaMaiorIdade(18);
        Assert.assertTrue(teste);
    }

    @Test
    public void verificaMenorIdade() {
        boolean teste = usuarioService.verificaMaiorIdade(17);
        Assert.assertFalse(teste);
    }

}
