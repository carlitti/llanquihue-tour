package model;

public class Tour {

    private String nombre;
    private String ciudad;
    private int precio;

    // Constructor
    public Tour(String nombre, String ciudad, int precio) {
        this.nombre = nombre;
        this.ciudad = ciudad;

        if (precio < 0) {
            System.out.println("Precio inválido, se asigna 0");
            this.precio = 0;
        } else {
            this.precio = precio;
        }
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
        if (precio < 0) {
            System.out.println("Precio inválido");
        } else {
            this.precio = precio;
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                " | Ciudad: " + ciudad +
                " | Precio: " + precio;
    }
}