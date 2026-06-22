package ui;

import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Crear gestor
        GestorDatos gestor = new GestorDatos();

        // Cargar datos
        gestor.cargarDatos();

        // Obtener lista
        ArrayList<Tour> lista = gestor.getListaTours();

        // Mostrar todos
        System.out.println("=== LISTA DE TOURS ===");
        for (Tour t : lista) {
            System.out.println(t);
        }

        // Filtro precio
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

        // 🔥 EXTRA: búsqueda por nombre
        System.out.println("\n=== BÚSQUEDA POR NOMBRE 'Lago' ===");

        boolean encontradoNombre = false;

        for (Tour t3 : lista) {
            if (t3.getNombre().toLowerCase().contains("lago")) {
                System.out.println(t3);
                encontradoNombre = true;
            }
        }

        if (!encontradoNombre) {
            System.out.println("No se encontraron resultados.");
        }
    }
}