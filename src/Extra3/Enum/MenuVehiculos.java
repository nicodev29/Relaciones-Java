package Extra3.Enum;

import java.util.Scanner;

public enum MenuVehiculos {
    ERROR("Error: Ingrese una opcion valida"),
    VOLVER("0 - Volver"),

    CARGARVEHICULOS("1 - Cargar vehiculos"),
    EDITARVEHICULOS("2 - Editar vehiculos"),
    ELIMINARVEHICULOS("3 - Eliminar vehiculos"),
    MOSTRARVEHICULOS("4 - Mostrar vehiculos"),
    MENU("\033[H\033[2J" + "\tMENU VEHICULOS\n" +
            VOLVER + "\n" +
            CARGARVEHICULOS + "\n" +
            EDITARVEHICULOS + "\n" +
            ELIMINARVEHICULOS + "\n" +
            MOSTRARVEHICULOS),

    INGRESEMARCA("Ingrese marca"),
    INGRESEMODELO("Ingrese modelo"),
    INGRESEAÑO("Ingrese año"),
    INGRESENUMEROMOTOR("Ingrese numero de motor"),
    INGRESENUMEROCHASIS("Ingrese numero de chasis"),
    INGRESECOLOR("Ingrese color"),
    INGRESETIPO("Ingrese tipo");

    private String texto;
    private final Scanner scanner = new Scanner(System.in);

    private MenuVehiculos(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return texto;
    }

    public String getTexto() {
        return this.texto;
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
