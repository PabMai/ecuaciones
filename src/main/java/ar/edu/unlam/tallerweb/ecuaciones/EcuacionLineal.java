package ar.edu.unlam.tallerweb.ecuaciones;

/**
 * Representa una ecuación lineal del tipo f(x) = m × x + b.
 *
 */
public class EcuacionLineal implements Ecuacion {

	/** @param m es la pendiente */
	private Double m;
	/** @param b es la ordenada al origen */
	private Double b;
	/** Constructor parametrizado. */
	public EcuacionLineal(final Double m, final Double b) {

		 this.m = m;
		 this.b = b;
	}

	/**
	 * Devuelve el resultado de evaluar f(x).
	 *
	 * @param x es la variable incognita.
	 * @return resultado es el resultado de evaluar f(x).
	 */
	public final Double resolver(final Double x) {

		Double resultado;

		resultado = m * x + b;

		return resultado;

	}

}
