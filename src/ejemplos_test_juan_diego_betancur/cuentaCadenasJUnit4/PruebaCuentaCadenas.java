package ejemplos_test_juan_diego_betancur.cuentaCadenasJUnit4;

public class PruebaCuentaCadenas {

	public static void main(String[] args) {
		
		//PRUEBAS QUE IBA HACIENDO PARA VER SI LAS CLASES Y LOS MÉTODOS QUE MODIFIQUÉ FUNCIONABAN
		
		System.out.println(CuentaCadenas.contarCadenas("22", "ddwdwd"));
		System.out.println(CuentaCadenas.contarVocales('a', "acaddfdabasdf"));
		
		CuentaCadenasPara_Parametrizadas c1 = new CuentaCadenasPara_Parametrizadas("ab", "jejfeiab");
		System.out.println(c1.contarCadenas());
		
		CuentaCadenasPara_Parametrizadas c2 = new CuentaCadenasPara_Parametrizadas('f', "jejffeiab");
		System.out.println(c2.contarVocales());
		
	
	}

}
