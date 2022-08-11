package com.bootcamp.springboottest;

import com.bootcamp.springboottest.controller.TestController;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUnitController {

    @Test
    public void TestUnit(){
        TestController controller = new TestController();
        String resultado = controller.Saudacao("Juan");
        assertEquals("Bem-vindo, Juan", resultado);

    }
}
