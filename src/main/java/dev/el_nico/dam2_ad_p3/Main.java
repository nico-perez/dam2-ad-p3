package dev.el_nico.dam2_ad_p3;

import org.apache.commons.lang3.StringUtils;
import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;

import dev.el_nico.dam2_ad_p3.modelo.Centro;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        ODB db = ODBFactory.open("src/main/resources/base_de_datos.txt");
        try {

            db.store(new Centro(1, "un centro", "un director", "una direccion", "una localidad", "una provincia"));

            int orden = 0;
            do {
                imprimirMenu();
                orden = pedirOrden();
                acatar(orden);
            } while(orden != 0);

        } finally {
            if (db != null) db.close();
        }
    }

    private static void imprimirMenu() {
        System.out.println("\nÓrdenes válidas:\n================\n"
                + "0 -> Salir\n1 -> Poblar base de datos\n2 -> Listar todos los centros\n"
                + "3 -> Listar todos los profesores\n4 -> Listar todos los profesores de un centro\n"
                + "5 -> Listar todos los profesores de un centro cuya fecha de nacimiento sea anterior a 1993\n"
                + "6 -> Listar los profesores con sexo masculino que impartan la asignatura de \"Acceso a datos\"\n"
                + "7 -> Comprobar que un profesor ya existe\n");
    }

    private static void acatar(int orden) {
        switch(orden) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            default: break;
        }
    }

    // Devuelve un entero entre 0 y 7
    private static int pedirOrden() {
        boolean input_ok = false;
        int orden = 0;
        do {
            try {
                orden = pedirEntero("orden", false);
                if (orden < 0 || orden > 7) {
                    System.out.println("Orden no válida.");
                } else {
                    input_ok = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Eso no es un número del 0 al 7.");
            }
        } while (!input_ok);

        return orden;
    }

    /**
     * Devuelve un string que puede ser null o no según el parámetro booleano.
     */
    private static String pedirString(String msj, boolean puedeEstarVacio) {
        String s;
        boolean error = false;
        do {
            if (error) System.out.println("El string no puede estar vacío.");
            System.out.print(msj + " (string): ");
            s = System.console().readLine();
        } while (puedeEstarVacio ? false : (error = StringUtils.isBlank(s)));
        return StringUtils.isBlank(s) ? null : s.trim();
    }

    /**
     * Pide un entero que puede ser null o no según el parámetro booleano.
     */
    private static Integer pedirEntero(String msj, boolean puedeSerNull) {
        while (true) {
            System.out.print(msj + " (entero): ");
            int entero;
            try {
                String s = System.console().readLine();
                if (puedeSerNull && StringUtils.isBlank(s)) {
                    return null;
                } else {
                    entero = Integer.parseInt(s);
                    return entero;
                }
            } catch (NumberFormatException e) {
                System.out.println("Eso no es un entero.");
            }
        }
    }
}
