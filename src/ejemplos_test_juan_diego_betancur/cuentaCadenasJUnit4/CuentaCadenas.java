package ejemplos_test_juan_diego_betancur.cuentaCadenasJUnit4;

public class CuentaCadenas {

	public static int contarCadenas(String cadena, String a_leer) {

		int numCadenas = 0;

		String c = a_leer;

		boolean control = true;

		while (control) {
			if (c.contains(cadena)) {
				numCadenas++;
				c = c.replaceFirst(cadena, "");
			} else {
				control = false;
			}
		}

		return numCadenas;
	

	}
	
	
	
	//Este metodo es casi igual al de ContarCadenas, solo que fue modificado para lanzar una excepcion de tipo NullPointerException
	public static int contarCadenasExcepcion(String cadena, String a_leer) {

		int numCadenas = 0;

		String c =null;

		boolean control = true;

		while (control) {
			if (c.contains(cadena)) {
				numCadenas++;
				c = c.replaceFirst(cadena, "");
			} else {
				control = false;
			}
		}

		return numCadenas;
	

	}
	
	
	public static int contarVocales(char vocal, String a_leer) {

		int numVocales = 0;
		int longitud = a_leer.length();
		int contador = 0;
		vocal = a_leer.charAt(0);

		while (contador < longitud) {
			if (vocal == a_leer.charAt(contador)) {
				numVocales++;
			}
			contador++;
		}

		return numVocales;

	}
	
	
	//Este método es casi igual al metodo contarVocales, solo que fue modificado de forma que lance una excepcion de tipo StringIndexOutOfBoundsException
	
	public static int contarVocalesExcepcion(char vocal, String a_leer) {

		int numVocales = 0;
		int longitud = a_leer.length();
		int contador = 0;
		vocal = a_leer.charAt(0);

		while (contador < longitud) {
			if (vocal == a_leer.charAt(contador)) {
				numVocales++;
			}
			contador--;
		}

		return numVocales;

	}
	
	
}
