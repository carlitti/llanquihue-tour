package ui;

import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Crear gestor
        GestorDatos gestor = new GestorDatos();

        // Cargar datos desde archivo
        gestor.cargarDatos();

        // Obtener lista de tours
        ArrayList<Tour> lista = gestor.getListaTours();

        // ✅ 1. Mostrar todos los tours
        System.out.println("=== LISTA DE TOURS ===");
        for (Tour t : lista) {
            System.out.println(t);
        }

        // ✅ 2. Filtrar (precio > 1000)
        System.out.println("\n=== TOURS CON PRECIO > 1000 ===");

        boolean encontrado = false;

        for (Tour t2 : lista) {
            if (t2.getPrecio() > 1000) {
                System.out.println(t2);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron tours.");
        }
    }
}
