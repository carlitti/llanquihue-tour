package model;

public class PaseoLacustre extends ServicioTuristico {

    private String tipoEmbarcacion;

    public PaseoLacustre(String nombre, int duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public String mostrarResumen() {
        return "Paseo Lacustre: " +
                nombre +
                " | Duración: " +
                duracionHoras +
                " horas | Embarcación: " +
                tipoEmbarcacion;
    }
}
