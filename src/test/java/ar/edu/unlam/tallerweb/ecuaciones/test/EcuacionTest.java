package ar.edu.unlam.tallerweb.ecuaciones.test;

import java.util.*;
import junit.framework.Assert;
import org.junit.Test;

import ar.edu.unlam.tallerweb.ecuaciones.Ecuacion;
import ar.edu.unlam.tallerweb.ecuaciones.EcuacionCuadratica;
import ar.edu.unlam.tallerweb.ecuaciones.EcuacionLineal;
import ar.edu.unlam.tallerweb.ecuaciones.EcuacionPolinomica;

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
		Double resultadoEsperado = 11.0;
		Assert.assertEquals("Se espera que el resultado sea 11",ecuacion.resolver(3.0),resultadoEsperado,precision);

	}

	@Test
	public void testEcuacionCuadraticaVer1() {

		Ecuacion ecuacion = new EcuacionCuadratica(1.0, 3.0,2.0);

		Double precision = 0.1;
		Double resultadoEsperado = 12.0;
		Assert.assertEquals("Se espera que el resultado sea 12",ecuacion.resolver(2.0),resultadoEsperado,precision);

	}

	@Test
	public void testEcuacionCuadraticaVer2() {

		Ecuacion ecuacion = new EcuacionCuadratica(2.0, 3.0,1.0);

		Double precision = 0.1;
		Double resultadoEsperado = 15.0;
		Assert.assertEquals("Se espera que el resultado sea 15",ecuacion.resolver(2.0),resultadoEsperado,precision);

	}

	@Test
	public void testEcuacionPolinomicaGroado2() {

		Ecuacion ecuacion = new EcuacionPolinomica(Arrays.asList(new Double[] {2.0, 3.0, 1.0}));

		Double precision = 0.1;
		Double resultadoEsperado = 15.0;
		Assert.assertEquals("Se espera que el resultado sea 15.0",ecuacion.resolver(-3.5),resultadoEsperado,precision);

	}

	@Test
	public void testEcuacionPolinomicaGroado3() {

		Ecuacion ecuacion = new EcuacionPolinomica(Arrays.asList(new Double[] {2.0, 2.0, 4.0, 1.0}));

		Double precision = 0.1;
		Double resultadoEsperado = 9.0;
		Assert.assertEquals("Se espera que el resultado sea 9.0",ecuacion.resolver(1.0),resultadoEsperado,precision);

	}

	@Test
	public void testEcuacionPolinomicaGroado4() {

		Ecuacion ecuacion = new EcuacionPolinomica(Arrays.asList(new Double[] {1.0, 4.0, 1.0, 3.0, 2.0}));

		Double precision = 0.1;
		Double resultadoEsperado = 4.3125;
		Assert.assertEquals("Se espera que el resultado sea 29.5625",ecuacion.resolver(0.5),resultadoEsperado,precision);

	}

	@Test
	public void testEcuacionPolinomicaGroado5() {

		Ecuacion ecuacion = new EcuacionPolinomica(Arrays.asList(new Double[] {1.0, 2.0, 4.0, 1.0, 3.0, 1.0}));

		Double precision = 0.1;
		Double resultadoEsperado = 12.0;
		Assert.assertEquals("Se espera que el resultado sea 29.5625",ecuacion.resolver(1.0),resultadoEsperado,precision);

	}

	@Test
	public void testEcuacionPolinomicaCasoEspecial() {

		Ecuacion ecuacion = new EcuacionPolinomica(Arrays.asList(new Double[] {2.0, 5.0}));

		Double precision = 0.1;
		Double resultadoEsperado = 9.0;
		Assert.assertEquals("Se espera que el resultado sea 9",ecuacion.resolver(2.0),resultadoEsperado,precision);

	}

}