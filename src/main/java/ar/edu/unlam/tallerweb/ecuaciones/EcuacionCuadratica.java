package ar.edu.unlam.tallerweb.ecuaciones;

/**
 * Representa una ecuación cuadrática del tipo.
 * f(x) = a × x^2 + b × x + c.
 *
 */
public class EcuacionCuadratica implements Ecuacion {

	/** @param a coeficiente a. */
	private Double a;

	/** @param b coeficiente b. */
	private Double b;

	/** @param c coeficiente c. */
	private Double c;

	/** Constructor parametrizado.
	 *  @param a coeficiente a de la ecuancion cuadratica
	 *  @param b coeficiente b de la ecuancion cuadratica
	 *  @param c coeficiente c de la ecuancion cuadratica*/
	public EcuacionCuadratica(final Double a,
			final Double b, final Double c) {

		this.a = a;
		this.b = b;
		this.c = c;

	}

	/**
    * Devuelve el resultado de evaluar f(x).
	*
	* @param x la variable
	* @return resultado el resultado
	*/
	public final Double resolver(final Double x) {

	Double resultado;
	resultado = a * (Math.pow(x, 2.0)) + b * x + c;

	return resultado;

	}

}
