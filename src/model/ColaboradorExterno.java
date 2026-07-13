package model;

public class ColaboradorExterno implements Registrable {

    private String empresa;

    public ColaboradorExterno(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String mostrarResumen() {
        return "Colaborador Externo: " + empresa;
    }
}