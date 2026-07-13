package data;

import model.*;

import java.util.ArrayList;

public class GestorEntidades {

    private ArrayList<Registrable> entidades;

    public GestorEntidades() {
        entidades = new ArrayList<>();
    }

    public void agregarEntidad(Registrable entidad) {
        entidades.add(entidad);
    }

    public String mostrarEntidades() {

        StringBuilder resultado = new StringBuilder();

        for (Registrable entidad : entidades) {

            resultado.append(entidad.mostrarResumen());

            if (entidad instanceof GuiaTuristico) {
                resultado.append(" -> Tipo Guía");
            }
            else if (entidad instanceof Vehiculo) {
                resultado.append(" -> Tipo Vehículo");
            }
            else if (entidad instanceof ColaboradorExterno) {
                resultado.append(" -> Tipo Colaborador");
            }
            else if (entidad instanceof ServicioTuristico) {
                resultado.append(" -> Tipo Servicio Turístico");
            }
            else if (entidad instanceof ExcursionCultural) {
                resultado.append(" -> Tipo Excursión Cultural");
            }

            resultado.append("\n");
        }

        return resultado.toString();
    }
}