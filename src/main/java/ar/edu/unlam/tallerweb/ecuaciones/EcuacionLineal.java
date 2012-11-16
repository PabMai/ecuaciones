package ar.edu.unlam.tallerweb.ecuaciones;

/**
 * Representa una ecuación lineal del tipo f(x) = m × x + b
 *
 */
public class EcuacionLineal implements Ecuacion {

	/**
	 * Constructor parametrizado
	 *
	 * @param m la pendiente
	 * @param b la ordenada al orígen
	 *
	 */
	
	private Double m;
	private Double b;
	
	public EcuacionLineal(Double m, Double b) {

		 this.m = m;
		 this.b = b;
		 
	}

	/**
	 * Devuelve el resultado de evaluar f(x)
	 *
	 * @param x la variable
	 *
	 */
		
	public Double resolver(Double x) {
		
		Double resultado;
		
		resultado = m*x+b;
		
		return resultado; 

	}

}
