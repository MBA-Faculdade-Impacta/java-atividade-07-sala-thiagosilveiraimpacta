package br.com.impacta.lab;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import br.com.impacta.models.*;
import org.junit.Test;

class JavaSpringTemplateApplicationTests {

	@Test
	public void shouldHaveCarwithEncapsulatePrinciple() {
				
    Carro carro = new Carro(2021, "Azul", 50000.00);
		assertEquals("Azul", carro.getCor());
		
	}
	
}
