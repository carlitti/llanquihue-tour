package model;

public class GuiaTuristico implements Registrable {

    private String nombre;
    private String idioma;

    public GuiaTuristico(String nombre, String idioma) {
        this.nombre = nombre;
        this.idioma = idioma;
    }

    @Override
    public String mostrarResumen() {
        return "Guía: " + nombre + " | Idioma: " + idioma;
    }
}