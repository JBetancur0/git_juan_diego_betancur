package ejemplos_test_juan_diego_betancur.cuentaCadenasJUnit4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CuentaCadenasParam.class, CuentaCadenasParam2.class, CuentaCadenasTest.class,
		CuentaCadenasTestExcepcion.class })
public class AllTests {

}
