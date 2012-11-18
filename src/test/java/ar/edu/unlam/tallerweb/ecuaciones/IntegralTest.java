package ar.edu.unlam.tallerweb.ecuaciones;

import java.util.Arrays;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Agregue los tests que considere necesarios. Se proporciona un test a modo de
 * testigo.
 * 
 */
public class IntegralTest {

	@Test
	public void areaBajoLaIdentidadEcuacionLinealVer1() {

		Ecuacion ecuacion = new EcuacionLineal(2.0, 5.0);
		IntegralDeArea integral = new IntegralDeArea();
		
		Double incremento = 0.0001;
		Double areaObtenida = integral.calcular(ecuacion, 0.0, 3.0, incremento);
		Double precision = 0.1;
		Double areaEsperada = 24.0;
		Assert.assertEquals(
				"Se espera que el Area bajo la recta identidad entre 0 y 3 sea 24",
				areaObtenida,areaEsperada,precision);
			
	}
	
	@Test
	public void areaBajoLaIdentidadEcuacionLinealVer2() {

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
	
	@Test
	public void areaBajoLaIdentidadEcuacionCuadratica() {

		Ecuacion ecuacion = new EcuacionCuadratica(1.0, 3.0, 2.0);
		IntegralDeArea integral = new IntegralDeArea();
		
		Double incremento = 0.0001;
		Double areaObtenida = integral.calcular(ecuacion, 1.0, 5.0, incremento);
		Double precision = 0.1;
		Double areaEsperada = 85.3;
		Assert.assertEquals(
				"Se espera que el Area bajo la recta identidad entre 1 y 5 sea 85.3",
				areaObtenida,areaEsperada,precision);
			
	}
	
	@Test
	public void areaBajoLaIdentidadEcuacionPolinomicaGrado4() {

		Ecuacion ecuacion = new EcuacionPolinomica(Arrays.asList(new Double[] {1.0, 4.0, 1.0, 3.0, 2.0}));
		IntegralDeArea integral = new IntegralDeArea();
		
		Double incremento = 0.0001;
		Double areaObtenida = integral.calcular(ecuacion, 2.0, 3.0, incremento);
		Double precision = 0.1;
		Double areaEsperada = 123.033;
		Assert.assertEquals(
				"Se espera que el área bajo la recta identidad entre 2 y 3 sea 123.033",
				areaObtenida,areaEsperada,precision);
	}	
	
	@Test
	public void areaBajoLaIdentidadEcuacionPolinomicaGrado5() {

		Ecuacion ecuacion = new EcuacionPolinomica(Arrays.asList(new Double[] {1.0, 2.0, 4.0, 1.0, 3.0, 1.0}));
		IntegralDeArea integral = new IntegralDeArea();
		
		Double incremento = 0.0001;
		Double areaObtenida = integral.calcular(ecuacion, 2.0, 3.0, incremento);
		Double precision = 0.1;
		Double areaEsperada = 275.067;
		Assert.assertEquals(
				"Se espera que el área bajo la recta identidad entre 2 y 3 sea 275.067",
				areaObtenida,areaEsperada,precision);
	}
	
	
	@Test
	public void areaBajoLaIdentidadEcuacionPolinomicaCasoEspecial() {
		
		Ecuacion ecuacion = new EcuacionPolinomica(Arrays.asList(new Double[] {2.0, 0.0}));
		IntegralDeArea integral = new IntegralDeArea();
		
		Double incremento = 0.0001;
		Double areaObtenida = integral.calcular(ecuacion, 0.0, 3.0, incremento);
		Double precision = 0.1;
		Double areaEsperada = 9.0;
		Assert.assertEquals(
				"Se espera que el área bajo la recta identidad entre 0 y 3 sea 9",
				areaObtenida,areaEsperada,precision);
			
	}

}
