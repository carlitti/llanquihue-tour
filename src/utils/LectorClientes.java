package utils;

import model.Cliente;
import model.Direccion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class LectorClientes {

    public static ArrayList<Cliente> cargarClientes(String archivo) {

        ArrayList<Cliente> clientes = new ArrayList<>();

        try {

            BufferedReader br =
                    new BufferedReader(
                            new FileReader(archivo)
                    );

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                if (datos.length < 4) {
                    System.out.println(
                            "Línea inválida: " + linea
                    );
                    continue;
                }

                String nombre = datos[0];
                String rut = datos[1];
                String calle = datos[2];
                String comuna = datos[3];

                Direccion direccion =
                        new Direccion(
                                calle,
                                comuna
                        );

                Cliente cliente =
                        new Cliente(
                                nombre,
                                rut,
                                direccion
                        );

                clientes.add(cliente);
            }

            br.close();

        } catch (Exception e) {

            System.out.println(
                    "Error al leer archivo: "
                            + e.getMessage()
            );
        }

        return clientes;
    }
}