package ar.edu.unlam.tallerweb.ecuaciones.excepciones;

/**
 * Clase ExcepcionIntervalo.
 */
@SuppressWarnings("serial")
public class ExcepcionIntervalo extends Exception {

    /**
     * Metodo que muestra un mensaje de error.
     */
    public ExcepcionIntervalo() {
        super("Error en intervalo");
    }
}
