package ar.edu.unlam.tallerweb.ecuaciones;

/**
 * Representa una ecuación cuadrática del tipo.
 * f(x) = a × x^2 + b × x + c.
 *
 */
public class EcuacionCuadratica implements Ecuacion {

	/** Constructor parametrizado.*/
	private Double a;

	/** The b. */
	private Double b;

	/** The c. */
	private Double c;

	/**
	 * Instantiates a new ecuacion cuadratica.
	 *
	 * @param a the a
	 * @param b the b
	 * @param c the c
	 */

	public EcuacionCuadratica(final Double a, final Double b, final Double c) {

		this.a = a;
		this.b = b;
		this.c = c;

	}

	/**
 * Devuelve el resultado de evaluar f(x).
	*
	* @param x la variable
	* @return the double
	*/
	public Double resolver(final Double x) {

	Double resultado;
	resultado = a * (Math.pow(x, 2.0)) + b * x + c;

	return resultado;

	}

}
