package ar.edu.unlam.tallerweb.ecuaciones;

/**
 * Representa la abstracción del cálculo de la integral bajo
 * la curva proporcionada.
 *
 */
public class IntegralDeArea {

	/**
	 * Calcula el área bajo la curva, utilizando el método de las sumas
	 * de Riemann entre los dos puntos dados.
	 *
	 * @param ecuacion
	 * @param inicio -> a
	 * @param fin -> b 
	 * @param incremento -> delta
	 * @return el área bajo la curva
	 */
	public Double calcular(Ecuacion ecuacion, Double inicio,
			Double fin, Double incremento) {
		
		Double suma=0.0;
		Double x=inicio;		
		
		while(x<=fin){
			suma += ecuacion.resolver(x);
			x += incremento;
		}
		
		return suma*incremento;
	}
	
	
}
