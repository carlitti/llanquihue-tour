package ui;

import data.GestorServicios;

public class Main {

    public static void main(String[] args) {

        GestorServicios gestor = new GestorServicios();

        System.out.println("=== SERVICIOS TURÍSTICOS LLANQUIHUE TOUR ===");

        gestor.mostrarServicios();
    }
}