package model;

public class ServicioTuristico {

    protected String nombre;
    protected int duracionHoras;

    public ServicioTuristico(String nombre, int duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    public void mostrarInformacion() {
        System.out.println(
                "Nombre: " + nombre +
                        " | Duración: " + duracionHoras + " horas");
    }
}
