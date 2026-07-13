package model;

public abstract class ServicioTuristico implements Registrable {

    protected String nombre;
    protected int duracionHoras;

    public ServicioTuristico(String nombre, int duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    public abstract String mostrarResumen();
}