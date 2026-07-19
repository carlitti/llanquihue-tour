package model;

public class GuiaTuristico extends Persona {

    private String idioma;

    public GuiaTuristico(
            String nombre,
            String rut,
            Direccion direccion,
            String idioma) {

        super(nombre, rut, direccion);
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public String mostrarResumen() {
        return "Guía: " + getNombre()
                + " | Rut: " + getRut()
                + " | Dirección: " + getDireccion()
                + " | Idioma: " + idioma;
    }

    @Override
    public String toString() {
        return mostrarResumen();
    }
}