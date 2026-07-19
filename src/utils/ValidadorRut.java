package utils;

import model.RutInvalidoException;

public class ValidadorRut {

    public static void validar(String rut)
            throws RutInvalidoException {

        if (rut == null || rut.length() < 8) {

            throw new RutInvalidoException(
                    "El RUT ingresado no es válido."
            );
        }
    }
}