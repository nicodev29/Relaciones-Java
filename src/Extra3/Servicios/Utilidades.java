package Extra3.Servicios;
import java.util.Scanner;

public class Utilidades {
    private static final Scanner scanner = new Scanner(System.in);

    public static void presionarEnter() {
        while (true) {
            System.out.println("Presione enter para continuar");
            if (scanner.nextLine().equals(""))
                break;
        }
    }

    public static String ingresarString(String texto) {
        System.out.println(texto);
        return scanner.nextLine();
    }

    public static int ingresarInt(String texto) {
        System.out.println(texto);
        return Integer.parseInt(scanner.nextLine());
    }

}
