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
	 * @param ecuacion el objeto ecuacion
	 * @param inicio inicio del intervalo
	 * @param fin fin del intervalo
	 * @param incremento incremento del intervalo
	 * @return el área bajo la curva
	 * @throws ExcepcionIntervalo the excepcion intervalo
	 */
	public final Double calcular(final Ecuacion ecuacion,
			final Double inicio, final Double fin,
			final Double incremento)
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

