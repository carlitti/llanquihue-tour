package model;

public class Direccion {

    private String calle;
    private String comuna;

    public Direccion(String calle, String comuna) {
        this.calle = calle;
        this.comuna = comuna;
    }

    public String getCalle() {
        return calle;
    }

    public String getComuna() {
        return comuna;
    }

    @Override
    public String toString() {
        return calle + ", " + comuna;
    }
}