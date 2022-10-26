package Extra3.Enum;

import java.util.Scanner;

public enum MenuPolizas {
    ERROR("Error: Ingrese una opcion valida"),
    VOLVER("0 - Volver"),

    CARGARPOLIZAS("1 - Cargar poliza"),
    EDITARPOLIZAS("2 - Editar poliza"),
    ELIMINARPOLIZAS("3 - Eliminar poliza"),
    MOSTRARPOLIZAS("4 - Mostrar poliza"),
    MENU("\033[H\033[2J" + "\tMENU POLIZAS\n" +
            VOLVER + "\n" +
            CARGARPOLIZAS + "\n" +
            EDITARPOLIZAS + "\n" +
            ELIMINARPOLIZAS + "\n" +
            MOSTRARPOLIZAS),

    INGRESENUMEROMOTOR("Ingrese numero de motor"),
    INGRESENUMEROCHASIS("Ingrese numero de chasis"),
    INGRESEDOCUMENTO("Ingrese documento"),
    INGRESENUMEROPOLIZA("Ingrese numero de poliza"),
    INGRESEFECHAINICIO("Ingrese fecha de inicio"),
    INGRESEFECHAFIN("Ingrese fecha de fin"),
    INGRESECANTIDADCUOTAS("Ingrese cantidad de cuotas"),
    INGRESECUOTAS("Ingrese cuotas"),
    INGRESEMONTOASEGURADO("Ingrese monto asegurado"),
    INGRESETIPOCOBERTURA("Ingrese tipo de cobertura");

    private String texto;
    private final Scanner scanner = new Scanner(System.in);

    private MenuPolizas(String texto) {
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
