package Extra3.Enum;

import java.util.Scanner;

public enum MenuPrincipal {
    ERROR("Error: Ingrese una opcion valida"),
    SALIR("0 - Salir"),

    GESTIONCLIENTES("1 - Gestion de clientes"),
    GESTIONVEHICULOS("2 - Gestion de vehículos"),
    GESTIONPOLIZAS("3 - Gestion de polizas"),
    GESTIONCUOTAS("4 - Gestion de cuotas"),

    MENU("\033[H\033[2J" + "\tMENU PRINCIPAL\n" +
         SALIR + "\n" +
                 GESTIONCLIENTES + "\n" +
                 GESTIONVEHICULOS + "\n" +
                 GESTIONPOLIZAS + "\n" +
                 GESTIONCUOTAS);

    private final Scanner scanner = new Scanner(System.in);
    private final String texto;

    MenuPrincipal(final String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return texto;
    }

    public int seleccion() {
        int opcion;

        do {
            System.out.println(MENU);
            opcion = scanner.nextInt();
            if (!(0 <= opcion && opcion < 5)) {
                System.out.println(ERROR);
            }
        } while (!(0 <= opcion && opcion < 5));

        return opcion;
    }
}