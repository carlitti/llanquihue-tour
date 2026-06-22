package data;

import model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class GestorDatos {

    private ArrayList<Tour> listaTours = new ArrayList<>();

    public void cargarDatos() {

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/resources/tours.txt"));
            String linea;

            while ((linea = br.readLine()) != null) {

                if (linea.trim().isEmpty()) {
                    continue;
                }

                String[] partes = linea.split(";");

                if (partes.length < 3) {
                    continue;
                }

                String nombre = partes[0];
                String ciudad = partes[1];

                int precio;
                try {
                    precio = Integer.parseInt(partes[2]);
                } catch (NumberFormatException e) {
                    System.out.println("Error en precio: " + partes[2]);
                    continue;
                }

                Tour tour = new Tour(nombre, ciudad, precio);
                listaTours.add(tour);
            }

            br.close();

        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public ArrayList<Tour> getListaTours() {
        return listaTours;
    }
}