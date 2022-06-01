package ejemplos_test_juan_diego_betancur.cuentaCadenasJUnit4;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class CuentaCadenasParam2 {
		private char VocalB;
		private String CadenaA;
		private int result;
	
		
	
	public CuentaCadenasParam2(char vocalB, String cadenaA, int result) {
			VocalB = vocalB;
			CadenaA = cadenaA;
			this.result = result;
		}
	
	
	
	//Diferentes casos de prueba del metodo ContarVocales, en las que se comprueban cosas como:
	//1.Si el programa puede contar consonantes y no solo vocales.
	//2.Si el programa detecta un número como vocal y lo encuentra en la cadena a analizar.
	//3.Si el programa detecta vocales con consonantes y las encuentra en la cadena a analizar.
	//4.Si el programa detecta vocales en mayuscula, y si en la cadena a anlizar dichas vocales estan todas juntas.
	//5.Si el programa puede encontrar dos vocales en vez de solo una.
	@Parameters
	public static Collection<Object[]> cadenas(){   
		return Arrays.asList(new Object[][] { 
			{'t', "aoieaoitt", 2},
			{'2', "jdwidj2", 1 },
			{'á', "di3dwiádd", 1},
			{'A', "jdkwdmAdwd", 3 },
			{"ae","uuuaeuuuu", 1 }});
		
		
	}


	@Test
	public void testContarVocales() {
		CuentaCadenasPara_Parametrizadas c1 = new CuentaCadenasPara_Parametrizadas(VocalB,CadenaA);
		int resultado = c1.contarVocales();
		assertEquals(result, resultado);
	}

}
