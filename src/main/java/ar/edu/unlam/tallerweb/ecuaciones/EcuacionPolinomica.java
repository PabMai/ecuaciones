package ar.edu.unlam.tallerweb.ecuaciones;

import java.util.List;

/**
 * Representa una ecuación polinómica del tipo
 * f(x) = n + (n-1) × x + (n-2) × x^2 + ...
 *
 */
public class EcuacionPolinomica implements Ecuacion {

	/** @param coeficientes son los coeficientes del polinomio*/
	private List<Double> coeficientes;

	/** Constructor parametrizado.
	 *
	 * @param coeficientes son los coeficientes del polinomio
	 */
	public EcuacionPolinomica(final List<Double> coeficientes) {

		this.coeficientes = coeficientes;
	}

	/**
	 * Devuelve el resultado de evaluar f(x).
	 *
	 * @param x la variable
	 * @return resultadoSuma resultado de la sumatoria
	 *
	 */
	public final Double resolver(final Double x) {

		Double resultadoSuma = 0.0;
		int exp = 0;
		for (int i = coeficientes.size() - 1; i >= 0; i--) {
			Double potencia = Math.pow(x, exp);
			resultadoSuma += coeficientes.get(i) * (potencia);
			exp++;
		}
		return resultadoSuma;
	}

}
