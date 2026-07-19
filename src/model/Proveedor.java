package model;

public class Proveedor extends Persona {

    public Proveedor(
            String nombre,
            String rut,
            Direccion direccion) {

        super(nombre, rut, direccion);
    }

    @Override
    public String mostrarResumen() {
        return "Proveedor: " + getNombre();
    }
}