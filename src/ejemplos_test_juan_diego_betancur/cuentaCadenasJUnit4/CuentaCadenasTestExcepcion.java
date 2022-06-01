package ejemplos_test_juan_diego_betancur.cuentaCadenasJUnit4;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaCadenasTestExcepcion {

	
	//En este caso de prueba se usa un método modificado de forma que lance una excepción (Asignando como null la cadena a analizar)
	
	@Test
	public void testContarCadenasExcepcion() {
		try {
			int c1 = CuentaCadenas.contarCadenasExcepcion("KI", "DWDSKILLL");
			fail("Error en la prueba, salta excepción");
			}catch(NullPointerException e1) {
				
				//Prueba superada
				
			}
	}

	
	//En este caso de prueba se usa un método modificado de forma que lance una excepción (Haciendo que el contador se ponga en negativo)
	
	@Test
	public void testContarVocalesExcepcion() {
		try {
			int c1 = CuentaCadenas.contarVocalesExcepcion('e', "erfffhe");
			fail("Error en la prueba, salta excepción");
			}catch(StringIndexOutOfBoundsException e1) {
				
				//Prueba superada
				
				
			}
	}

}
