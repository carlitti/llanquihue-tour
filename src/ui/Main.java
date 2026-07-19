package ui;

import data.GestorEntidades;
import model.*;
import utils.LectorClientes;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        GestorEntidades gestor = new GestorEntidades();

        int opcion;

        do {

            try {

                opcion = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                """
                                LLANQUIHUE TOUR
                                
                                1. Agregar Guía
                                2. Agregar Vehículo
                                3. Agregar Excursión Cultural
                                4. Mostrar Registros
                                5. Cargar Clientes desde TXT
                                6. Salir
                                """
                        )
                );

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(
                        null,
                        "Debe ingresar una opción válida."
                );

                opcion = 0;
            }

            switch (opcion) {

                case 1:

                    String nombre =
                            JOptionPane.showInputDialog(
                                    "Nombre del guía:"
                            );

                    String rut =
                            JOptionPane.showInputDialog(
                                    "Rut del guía:"
                            );

                    String calle =
                            JOptionPane.showInputDialog(
                                    "Calle:"
                            );

                    String comuna =
                            JOptionPane.showInputDialog(
                                    "Comuna:"
                            );

                    String idioma =
                            JOptionPane.showInputDialog(
                                    "Idioma del guía:"
                            );

                    Direccion direccion =
                            new Direccion(
                                    calle,
                                    comuna
                            );

                    gestor.agregarEntidad(
                            new GuiaTuristico(
                                    nombre,
                                    rut,
                                    direccion,
                                    idioma
                            )
                    );

                    JOptionPane.showMessageDialog(
                            null,
                            "Guía agregado correctamente."
                    );

                    break;

                case 2:

                    String patente =
                            JOptionPane.showInputDialog(
                                    "Patente del vehículo:"
                            );

                    int capacidad = 0;
                    boolean datoValido = false;

                    while (!datoValido) {

                        try {

                            capacidad = Integer.parseInt(
                                    JOptionPane.showInputDialog(
                                            "Capacidad del vehículo:"
                                    )
                            );

                            datoValido = true;

                        } catch (NumberFormatException e) {

                            JOptionPane.showMessageDialog(
                                    null,
                                    "Debe ingresar solamente números."
                            );
                        }
                    }

                    gestor.agregarEntidad(
                            new Vehiculo(
                                    patente,
                                    capacidad
                            )
                    );

                    JOptionPane.showMessageDialog(
                            null,
                            "Vehículo agregado correctamente."
                    );

                    break;

                case 3:

                    String nombreExcursion =
                            JOptionPane.showInputDialog(
                                    "Nombre de la excursión:"
                            );

                    int duracion = 0;
                    boolean duracionValida = false;

                    while (!duracionValida) {

                        try {

                            duracion = Integer.parseInt(
                                    JOptionPane.showInputDialog(
                                            "Duración en horas:"
                                    )
                            );

                            duracionValida = true;

                        } catch (NumberFormatException e) {

                            JOptionPane.showMessageDialog(
                                    null,
                                    "Debe ingresar solamente números."
                            );
                        }
                    }

                    String lugar =
                            JOptionPane.showInputDialog(
                                    "Lugar histórico:"
                            );

                    gestor.agregarEntidad(
                            new ExcursionCultural(
                                    nombreExcursion,
                                    duracion,
                                    lugar
                            )
                    );

                    JOptionPane.showMessageDialog(
                            null,
                            "Excursión agregada correctamente."
                    );

                    break;

                case 4:

                    String resultado =
                            gestor.mostrarEntidades();

                    if (resultado.isEmpty()) {

                        JOptionPane.showMessageDialog(
                                null,
                                "No existen registros."
                        );

                    } else {

                        JOptionPane.showMessageDialog(
                                null,
                                resultado
                        );
                    }

                    break;

                case 5:

                    ArrayList<Cliente> clientes =
                            LectorClientes.cargarClientes(
                                    "src/resources/clientes.txt"
                            );

                    for (Cliente cliente : clientes) {

                        gestor.agregarEntidad(cliente);
                    }

                    JOptionPane.showMessageDialog(
                            null,
                            clientes.size()
                                    + " clientes cargados correctamente desde el archivo."
                    );

                    break;

                case 6:

                    JOptionPane.showMessageDialog(
                            null,
                            "Programa finalizado."
                    );

                    break;

                default:

                    if (opcion != 0) {

                        JOptionPane.showMessageDialog(
                                null,
                                "Opción no válida."
                        );
                    }
            }

        } while (opcion != 6);
    }
}