package model;

public class Cliente extends Persona {

    public Cliente(
            String nombre,
            String rut,
            Direccion direccion) {

        super(nombre, rut, direccion);
    }
    @Override
    public String mostrarResumen() {

        return "Cliente: "
                + getNombre()
                + " | Rut: "
                + getRut()
                + " | Dirección: "
                + getDireccion();
    }
}
