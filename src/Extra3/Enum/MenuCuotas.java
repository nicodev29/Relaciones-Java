package Extra3.Enum;

import java.util.Scanner;

public enum MenuCuotas {
    ERROR("Error: Ingrese una opcion valida"),
    VOLVER("0 - Volver"),

    PAGARCUOTA("1 - Pagar cuota"),
    ELIMINARCUOTA("2 - Eliminar pago cuota"),
    MOSTRARCUOTAS("3 - Mostrar cuotas"),
    MENU("\033[H\033[2J" + "\tMENU CUOTAS\n" +
            VOLVER + "\n" +
            PAGARCUOTA + "\n" +
            ELIMINARCUOTA + "\n" +
            MOSTRARCUOTAS),

    INGRESENUMEROPOLIZA("Ingrese numero de poliza"),
    INGRESEDOCUMENTO("Ingrese documento"),
    INGRESENUMEROCUOTA("Ingrese numero de cuota"),
    INGERSEMONTOPAGADOCUOTA("Ingrese monto pagado de cuota"),
    INGRESEFORMADEPAGO("Ingrese forma de pago");

    private String texto;
    private final Scanner scanner = new Scanner(System.in);

    private MenuCuotas(String texto) {
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
