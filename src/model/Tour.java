package model;

public class Tour {

    private String nombre;
    private String ciudad;
    private int precio;

    // Constructor
    public Tour(String nombre, String ciudad, int precio) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.precio = precio;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getPrecio() {
        return precio;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    // toString
    @Override
    public String toString() {
        return "Tour{" +
                "nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", precio=" + precio +
                '}';
    }
}