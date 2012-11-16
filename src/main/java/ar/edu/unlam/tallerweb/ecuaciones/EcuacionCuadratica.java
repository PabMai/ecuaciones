package ar.edu.unlam.tallerweb.ecuaciones;

/**
 * Representa una ecuación cuadrática del tipo
 * f(x) = a × x^2 + b × x + c
 *
 */
public class EcuacionCuadratica implements Ecuacion {

	/**
	 * Constructor parametrizado
	 *
	 * @param a
	 * @param b
	 * @param c
	 *
	 */
	
	private Double a;
	private Double b;
	private Double c;
	
	public EcuacionCuadratica(Double a, Double b, Double c) {

		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**
	 * Devuelve el resultado de evaluar f(x)
	 *
	 * @param x la variable
	 *
	 */
	public Double resolver(Double x) {
		
		Double resultado;
		
		resultado = a * (Math.pow(x, 2.0)) + b * x + c;
		
		return resultado;

	}

}
