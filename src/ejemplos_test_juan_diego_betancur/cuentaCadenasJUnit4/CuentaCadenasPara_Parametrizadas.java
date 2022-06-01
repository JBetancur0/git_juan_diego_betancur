package ejemplos_test_juan_diego_betancur.cuentaCadenasJUnit4;

public class CuentaCadenasPara_Parametrizadas {

	
	//ESTA CLASE ES CASI IGUAL A LA DE "CuentaCadenas" SOLO QUE FUE MODIFICADA DE FORMA QUE TUVIERA CONSTRUCTORES Y DE ESTA FORMA HACER LAS PARAMETRIZADAS DE FORMA MAS FACIL
		//(AL MENOS A MI SE ME HACIA MAS FACIL DE REALIZAR Y DE COMPRENDER SI MODIFICABA LA CLASE DE ESTA FORMA, ES PROBABLE QUE DICHA MODIFICACIÓN NO SEA NECESARIA)
		
		String CadenaB;
		String CadenaA;
		char VocalB;
		
		
		public CuentaCadenasPara_Parametrizadas(String cadenaB, String cadenaA) {
			this.CadenaB = cadenaB;
			this.CadenaA = cadenaA;
		}
		
		public CuentaCadenasPara_Parametrizadas(char vocalB,String cadenaA) {
			this.CadenaA = cadenaA;
			this.VocalB = vocalB;
		}
		
		
		public int contarCadenas() {

			int numCadenas = 0;

			String c = this.CadenaA;

			boolean control = true;

			while (control) {
				if (c.contains(this.CadenaB)) {
					numCadenas++;
					c = c.replaceFirst(this.CadenaB, "");
				} else {
					control = false;
				}
			}

			return numCadenas;
		

		}
		
		
		public int contarVocales() {

			int numVocales = 0;
			int longitud = this.CadenaA.length();
			int contador = 0;
			this.VocalB = this.CadenaA.charAt(0);

			while (contador < longitud) {
				if (this.VocalB == this.CadenaA.charAt(contador)) {
					numVocales++;
				}
				contador++;
			}

			return numVocales;

		}
	
}
