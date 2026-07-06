package data;

import java.util.ArrayList;
import java.util.List;
import model.*;

public class GestorServicios {

    private List<ServicioTuristico> servicios;

    public GestorServicios() {

        servicios = new ArrayList<>();

        servicios.add(new RutaGastronomica(
                "Ruta del Salmón", 4, 5));

        servicios.add(new RutaGastronomica(
                "Sabores del Sur", 3, 3));

        servicios.add(new PaseoLacustre(
                "Lago Llanquihue", 2, "Lancha"));

        servicios.add(new PaseoLacustre(
                "Todos los Santos", 5, "Catamarán"));

        servicios.add(new ExcursionCultural(
                "Museo Alemán", 2, "Puerto Varas"));
    }

    public void mostrarServicios() {

        for (ServicioTuristico servicio : servicios) {
            servicio.mostrarInformacion();
        }
    }
}