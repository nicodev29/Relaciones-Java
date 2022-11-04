package Extra3.Enum;

import java.util.Scanner;

public enum MenuClientes {
    ERROR("Error: Ingrese una opcion valida"),
    VOLVER("0 - Volver"),

    CARGARCLIENTE("1 - Cargar cliente"),
    EDITARCLIENTE("2 - Editar cliente"),
    ELIMINARCLIENTE("3 - Eliminar cliente"),
    MOSTRARCLIENTES("4 - Mostrar clientes"),
    MENU("\033[H\033[2J" + "\tMENU CLIENTES\n" +
            VOLVER + "\n" +
            CARGARCLIENTE + "\n" +
            EDITARCLIENTE + "\n" +
            ELIMINARCLIENTE + "\n" +
            MOSTRARCLIENTES),

    INGRESENOMBRE("Ingrese nombre"),
    INGRESEAPELLIDO("Ingrese apellido"),
    INGRESEDOCUMENTO("Ingrese documento"),
    INGRESEMAIL("Ingrese email"),
    INGRESEDOMICILIO("Ingrese domicilio"),
    INGRESETELEFONO("Ingrese telefono");

    private String texto;
    private final Scanner scanner = new Scanner(System.in);

    private MenuClientes(String texto) {
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
            if (!(0 <= opcion && opcion <= 4)) {
                System.out.println(ERROR);
            }
        } while (!(0 <= opcion && opcion <= 4));

        return opcion;
    }
}