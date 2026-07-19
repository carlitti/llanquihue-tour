package model;

import utils.ValidadorRut;

public abstract class Persona implements Registrable {

    private String nombre;
    private String rut;
    private Direccion direccion;

    public Persona(
            String nombre,
            String rut,
            Direccion direccion) {

        try {

            ValidadorRut.validar(rut);

            this.nombre = nombre;
            this.rut = rut;
            this.direccion = direccion;

        } catch (Exception e) {

            System.out.println(e.getMessage());

            this.nombre = nombre;
            this.rut = "RUT INVALIDO";
            this.direccion = direccion;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return nombre + " - " + rut + " - " + direccion;
    }
}