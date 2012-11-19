package ar.edu.unlam.tallerweb.ecuaciones;

import ar.edu.unlam.tallerweb.ecuaciones.excepciones.ExcepcionIntervalo;

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
	 * @param ecuacion the ecuacion
	 * @param inicio -> a
	 * @param fin -> b
	 * @param incremento -> delta
	 * @return el área bajo la curva
	 * @throws ExcepcionIntervalo the excepcion intervalo
	 */
	public Double calcular(final Ecuacion ecuacion, final Double inicio,
			final Double fin, final Double incremento)
			throws  ExcepcionIntervalo {

		if (inicio > fin) {
            throw new ExcepcionIntervalo();
        }

		Double suma = 0.0;
		Double x = inicio;

		while (x <= fin) {
			suma += ecuacion.resolver(Math.abs(x));
			x += incremento;
		}

		return suma * incremento;

	}
}

