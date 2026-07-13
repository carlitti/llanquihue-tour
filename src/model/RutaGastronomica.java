package model;

public class RutaGastronomica extends ServicioTuristico {

    private int numeroDeParadas;

    public RutaGastronomica(String nombre, int duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public String mostrarResumen() {
        return "Ruta Gastronómica: " +
                nombre +
                " | Duración: " +
                duracionHoras +
                " horas | Paradas: " +
                numeroDeParadas;
    }

}