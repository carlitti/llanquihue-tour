package data;

import model.*;

public class GestorServicios {

    public void mostrarServicios() {

        RutaGastronomica r1 = new RutaGastronomica("Ruta del Salmón", 4, 5);
        RutaGastronomica r2 = new RutaGastronomica("Sabores del Sur", 3, 3);

        PaseoLacustre p1 = new PaseoLacustre("Lago Llanquihue", 2, "Lancha");
        PaseoLacustre p2 = new PaseoLacustre("Todos los Santos", 5, "Catamarán");

        ExcursionCultural e1 = new ExcursionCultural("Museo Alemán", 2, "Puerto Varas");
        ExcursionCultural e2 = new ExcursionCultural("Iglesia Frutillar", 1, "Frutillar");

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(e1);
        System.out.println(e2);
    }
}
