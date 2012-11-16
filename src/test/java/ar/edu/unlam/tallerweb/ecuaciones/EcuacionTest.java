package ar.edu.unlam.tallerweb.ecuaciones;

import java.util.*;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Agregue los tests que considere necesarios. Se proporciona un test
 * a modo de testigo.
 *
 */
public class EcuacionTest {

	@Test
	public void testEcuacionLineal() {
		
		Ecuacion ecuacion = new EcuacionLineal(2.0, 5.0);

		Double precision = 0.1;
		Double resultadoEsperado = 9.0;
		Assert.assertEquals("Se espera que el resultado sea 9",ecuacion.resolver(2.0),resultadoEsperado,precision);

	}
	
	@Test
	public void testEcuacionCuadratica() {
		
		Ecuacion ecuacion = new EcuacionCuadratica(1.0, 2.0,3.0);

		Double precision = 0.1;
		Double resultadoEsperado = 6.0;
		Assert.assertEquals("Se espera que el resultado sea 6",ecuacion.resolver(1.0),resultadoEsperado,precision);

	}
	
	@Test
	public void testEcuacionPolinomica() {
		
		Ecuacion ecuacion = new EcuacionPolinomica(Arrays.asList(new Double[] {1.0, 2.0, 3.0, 4.0, 5.0}));

		Double precision = 0.1;
		Double resultadoEsperado = 29.5625;
		Assert.assertEquals("Se espera que el resultado sea 29.5625",ecuacion.resolver(1.5),resultadoEsperado,precision);

	}
	
	@Test
	public void testEcuacionPolinomicaCasoEspecial() {
		
		Ecuacion ecuacion = new EcuacionPolinomica(Arrays.asList(new Double[] {2.0, 5.0}));

		Double precision = 0.1;
		Double resultadoEsperado = 9.0;
		Assert.assertEquals("Se espera que el resultado sea 9",ecuacion.resolver(2.0),resultadoEsperado,precision);

	}

}
