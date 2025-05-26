package com.example.meu_projeto_jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MeuProjetoJenkinsApplicationTests {

	 @Test
    public void testeSimples() {
        assertEquals(2 + 2, 4);
    }

}
