package ar.edu.unlam.tallerweb.ecuaciones.test;

import java.util.Arrays;
import junit.framework.Assert;
import org.junit.Test;

import ar.edu.unlam.tallerweb.ecuaciones.Ecuacion;
import ar.edu.unlam.tallerweb.ecuaciones.EcuacionCuadratica;
import ar.edu.unlam.tallerweb.ecuaciones.EcuacionLineal;
import ar.edu.unlam.tallerweb.ecuaciones.EcuacionPolinomica;
import ar.edu.unlam.tallerweb.ecuaciones.ExcepcionIntervalo;
import ar.edu.unlam.tallerweb.ecuaciones.IntegralDeArea;

/**
 * Agregue los tests que considere necesarios. Se proporciona un test a modo de
 * testigo.
 *
 */
public class IntegralTest {
	/**
	 * Verifica que el area de la ecuacion lineal sea 24 cuando m=2 y b=5.
	 *
	 */
	@Test
	public void areaBajoLaIdentidadEcuacionLinealVer1()
			throws ExcepcionIntervalo {

		Ecuacion ecuacion = new EcuacionLineal(2.0, 5.0);
		IntegralDeArea integral = new IntegralDeArea();

		Double incremento = 0.0001;
		Double areaObtenida =
				integral.calcular(ecuacion, 0.0, 3.0, incremento);
		Double precision = 0.1;
		Double areaEsperada = 24.0;
		Assert.assertEquals(
				"Se espera que el Area bajo la recta identidad entre 0 y 3 sea 24",
				areaObtenida, areaEsperada, precision);
	}
	/**
	 * Verifica que el area de la ecuacion lineal sea 9 cuando m=1 y b=0.
	 *
	 */
	@Test
	public void areaBajoLaIdentidadEcuacionLinealVer2()
			throws ExcepcionIntervalo {

		Ecuacion ecuacion = new EcuacionLineal(1.0, 0.0);
		IntegralDeArea integral = new IntegralDeArea();

		Double incremento = 0.0001;
		Double areaObtenida = integral.calcular(ecuacion, -3.0, 3.0, incremento);
		Double precision = 0.1;
		Double areaEsperada = 9.0;
		Assert.assertEquals(
				"Se espera que el Area bajo la recta identidad entre -3 y 3 sea 9",
				areaObtenida,areaEsperada,precision);

	}
	/**
	 * Verifica que el area de la ecuacion cuadratica sea 85.3 cuando
	 * a=1, b=3 y c=2.
	 *
	 */
	@Test
	public void areaBajoLaIdentidadEcuacionCuadratica()
			throws ExcepcionIntervalo {

		Ecuacion ecuacion = new EcuacionCuadratica(1.0, 3.0, 2.0);
		IntegralDeArea integral = new IntegralDeArea();

		Double incremento = 0.0001;
		Double areaObtenida =
				integral.calcular(ecuacion, 1.0, 5.0, incremento);
		Double precision = 0.1;
		Double areaEsperada = 85.3;
		Assert.assertEquals(
				"Se espera que el Area bajo la recta identidad entre 1 y 5 sea 85.3",
				areaObtenida,areaEsperada,precision);

	}
	/**
	 * Verifica que el area de la ecuacion polinomica de grado 4
	 * sea 123.033 cuando a=1, b=4, c=1, d=3, e=2.
	 *
	 */
	@Test
	public void areaBajoLaIdentidadEcuacionPolinomicaGrado4()
			throws ExcepcionIntervalo {

		Ecuacion ecuacion =
				new EcuacionPolinomica(Arrays.asList(
						new Double[] {1.0, 4.0, 1.0, 3.0, 2.0}));
		IntegralDeArea integral = new IntegralDeArea();

		Double incremento = 0.0001;
		Double areaObtenida = integral.calcular(ecuacion, 2.0, 3.0, incremento);
		Double precision = 0.1;
		Double areaEsperada = 123.033;
		Assert.assertEquals(
				"Se espera que el área bajo la recta identidad entre 2 y 3 sea 123.033",
				areaObtenida,areaEsperada,precision);
	}
	/**
	 * Verifica que el area de la ecuacion polinomica de grado 5
	 * sea 275.067 cuando a=1, b=2, c=4, d=1, e=3, f=1.
	 *
	 */
	@Test
	public void areaBajoLaIdentidadEcuacionPolinomicaGrado5()
			throws ExcepcionIntervalo {

		Ecuacion ecuacion =
				new EcuacionPolinomica(Arrays.asList(
						new Double[] {1.0, 2.0, 4.0, 1.0, 3.0, 1.0}));
		IntegralDeArea integral = new IntegralDeArea();

		Double incremento = 0.0001;
		Double areaObtenida =
				integral.calcular(ecuacion, 2.0, 3.0, incremento);
		Double precision = 0.1;
		Double areaEsperada = 275.067;
		Assert.assertEquals(
				"Se espera que el área bajo la recta identidad entre 2 y 3 sea 275.067",
				areaObtenida,areaEsperada,precision);
	}
	/**
	 * Verifica el caso especial, calculando una ecuacion lineal
	 * con la clase ecuacion polinomica.
	 *
	 */
	@Test
	public void areaBajoLaIdentidadEcuacionPolinomicaCasoEspecial()
			throws ExcepcionIntervalo {

		Ecuacion ecuacion =
				new EcuacionPolinomica(Arrays.asList(
						new Double[] {2.0, 0.0}));
		IntegralDeArea integral = new IntegralDeArea();

		Double incremento = 0.0001;
		Double areaObtenida =
				integral.calcular(ecuacion, 0.0, 3.0, incremento);
		Double precision = 0.1;
		Double areaEsperada = 9.0;
		Assert.assertEquals(
				"Se espera que el área bajo la recta identidad entre 0 y 3 sea 9",
				areaObtenida,areaEsperada,precision);

	}
	/**
	 * Verifica que la excepcion se produzca
	 *
	 */
	@Test(expected = ExcepcionIntervalo.class)
	public void areaBajoLaIdentidadEcuacionLinealExcepcion()
			throws ExcepcionIntervalo {

		Ecuacion ecuacion = new EcuacionLineal(2.0, 5.0);
		IntegralDeArea integral = new IntegralDeArea();

		Double incremento = 0.0001;
		Double areaObtenida =
				integral.calcular(ecuacion, 3.0, 0.0, incremento);
		Double precision = 0.1;
		Double areaEsperada = 24.0;
		Assert.assertEquals(
				"Se espera que el Area bajo la recta identidad entre 0 y 3 sea 24",
				areaObtenida, areaEsperada, precision);
	}

}
