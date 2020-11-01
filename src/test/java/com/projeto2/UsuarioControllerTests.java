package com.projeto2;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(UsuarioController.class)
public class UsuarioControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testarListaUsuario() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/usuario"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.jsonPath("$").isArray());
    }




}
