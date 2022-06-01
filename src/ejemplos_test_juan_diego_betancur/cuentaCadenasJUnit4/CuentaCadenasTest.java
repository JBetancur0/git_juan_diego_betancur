package ejemplos_test_juan_diego_betancur.cuentaCadenasJUnit4;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaCadenasTest {

	
	//En este primer caso de prueba comprobamos de la forma más básica, si el metodo ContarCadenas funciona
	//Introduciendo como cadena a buscar "ab" la cual aparece 2 veces en la cadena a analizar
	@Test
	public void testContarCadenas() {
		int c1 = CuentaCadenas.contarCadenas("ab", "dwdfewabduwhdab");
		assertEquals(2, c1);
	}
	
	//En este segundo caso de prueba, comprobamos como afectan los espacios al resultado final en el método
	//ContarCadenas. Podemos darnos cuenta que no afectan en nada ya que sigue arrojando el resultado esperado.
	
	@Test
	public void testContarCadenas2() {
		int c1 = CuentaCadenas.contarCadenas("ab", "djwabj abjdwjuda bdjwdiab");
		assertEquals(3, c1);
	}
	
	//En el tercer caso de prueba, comprobamos como afecta el uso de simbolos en el método contarVocales.
	//Dandonos cuenta de que tampoco influyen ya que conseguimos el resultado esperado.
	
	@Test
	public void testContarVocales() {
		int c1 = CuentaCadenas.contarVocales('o', "&&&oi:::__//o/i´´oi");
		assertEquals(3, c1);
	}
	
	//En el cuarto caso de prueba, vemos que pasa si separamos la cadena a buscar con espacios.
	//Dando como resultado nada fuera de lo comun, ya que sigue contando en número de vocales correctamente.
	
	@Test
	public void testContarVocales2() {
		int c1 = CuentaCadenas.contarVocales('o', "o oi");
		assertEquals(2, c1);
	}

}
