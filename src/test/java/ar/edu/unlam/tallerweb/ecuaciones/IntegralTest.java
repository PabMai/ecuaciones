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
	public void areaBajoLaIdentidadEcuacionLineal() {

		Ecuacion ecuacion = new EcuacionLineal(2.0, 0.0);
		IntegralDeArea integral = new IntegralDeArea();
		
		Double incremento = 0.0001;
		Double areaObtenida = integral.calcular(ecuacion, 0.0, 3.0, incremento);
		Double precision = 0.1;
		Double areaEsperada = 9.0;
		Assert.assertEquals(
				"Se espera que el área bajo la recta identidad entre 0 y 3 sea 9",
				areaObtenida,areaEsperada,precision);
			
	}
	
	@Test
	public void areaBajoLaIdentidadEcuacionCuadratica() {

		Ecuacion ecuacion = new EcuacionCuadratica(1.0, 2.0,3.0);
		IntegralDeArea integral = new IntegralDeArea();
		
		Double incremento = 0.0001;
		Double areaObtenida = integral.calcular(ecuacion, 0.0, 3.0, incremento);
		Double precision = 0.1;
		Double areaEsperada = 27.0;
		Assert.assertEquals(
				"Se espera que el área bajo la recta identidad entre 0 y 3 sea 27",
				areaObtenida,areaEsperada,precision);
			
	}
	
	@Test
	public void areaBajoLaIdentidadEcuacionPolinomica() {

		Ecuacion ecuacion = new EcuacionPolinomica(Arrays.asList(new Double[] {1.0, 2.0, 3.0, 4.0, 5.0}));
		IntegralDeArea integral = new IntegralDeArea();
		
		Double incremento = 0.0001;
		Double areaObtenida = integral.calcular(ecuacion, 3.0, 5.0, incremento);
		Double precision = 0.1;
		Double areaEsperada = 988.4;
		Assert.assertEquals(
				"Se espera que el área bajo la recta identidad entre 3 y 5 sea 988.4",
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
