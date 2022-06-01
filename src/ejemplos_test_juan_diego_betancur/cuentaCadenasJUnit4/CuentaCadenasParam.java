package ejemplos_test_juan_diego_betancur.cuentaCadenasJUnit4;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CuentaCadenasParam {
	private String CadenaB;
	private String CadenaA;
	private int result;
	
	
	public CuentaCadenasParam(String cadenaB, String cadenaA,int result) {
		this.CadenaB = cadenaB;
		this.CadenaA = cadenaA;
		this.result = result;
	}
	
	
	//Diferentes casos de prueba sobre el metodo contarCadenas, se comprueban los siguientes casos de diferentes formas:
	//1. Si el programa es capaz de tomar los números como cadenas y encontrarlos en la cadena a analizar.
	//2. Si el programa diferencia entre mayusculas y minúsculas.
	//3. Si el programa es capaz de tomar simbolos como cadenas y encontrarlos en la cadena a analizar.
	
	@Parameters
	public static Collection<Object[]> cadenas(){
		return Arrays.asList(new Object[][] { 
			{"23", "kwdjwi239kdk23kk23", 3},
			{"AB", "OLWOLOABmjsjab", 1},
			{"ab", "aBaBAbab", 1},
			{"4e", "frfrt4eef4e", 2},
			{"¿¿", "ddef¿ddw¿¿", 1} });
	
	}

	@Test
	public void testContarCadenas() {
		CuentaCadenasPara_Parametrizadas c1 = new CuentaCadenasPara_Parametrizadas(CadenaB,CadenaA);
		int resultado = c1.contarCadenas();
		assertEquals(result, resultado);
	}

}
