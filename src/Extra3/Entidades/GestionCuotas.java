package Extra3.Entidades;

import Extra3.Enum.MenuCuotas;
import Extra3.Servicios.Utilidades;

import java.util.stream.Collectors;

public class GestionCuotas {
    private static Database database;

    public static boolean opcion(Database db, int opcion) {
        database = db;
        switch (opcion) {
            case 0:
                return false;
            case 1:
                pagarCuota();
                break;
            case 2:
                eliminarPagoCuota();
                break;
            case 3:
                mostrarCuotas();
                break;
            default:
                System.out.println("Ingrese una opcion valida");
        }
        return true;
    }

    private static int verificarPoliza(int numero_poliza) {
        int posicion = 0;
        for (Poliza vehiculo : database.getPolizas()) {
            if (vehiculo.getNumero_poliza() == numero_poliza)
                return posicion;
            posicion++;
        }
        return -1;
    }

    private static int verificarNumeroCuota(int numero_cuota, int numero_poliza) {
        int posicion = 0;
        Poliza poliza = database.getPolizas().get(verificarPoliza(numero_poliza));
        for (Cuota couta : poliza.getCuotas()) {
            if (couta.getNumero_cuota() == numero_cuota)
                return posicion;
            posicion++;
        }
        return -1;
    }

    private static void pagarCuota() {
        int numero_poliza = Utilidades.ingresarInt(MenuCuotas.INGRESENUMEROPOLIZA.toString());
        if (verificarPoliza(numero_poliza) == -1) {
            System.out.println("La poliza no existe");
            return;
        }
        int numero_cuota = Utilidades.ingresarInt(MenuCuotas.INGRESENUMEROCUOTA.toString());
        if (verificarNumeroCuota(numero_cuota, numero_poliza) == -1) {
            System.out.println("La cuota no existe");
            return;
        }
        Cuota cuota = database.getPolizas().get(verificarPoliza(numero_poliza)).getCuotas()
                .get(verificarNumeroCuota(numero_cuota, numero_poliza));
        cuota.setPagado(cuota.getMonto_total());
    }

    private static void mostrarCuotas() {
        int numero_poliza = Utilidades.ingresarInt(MenuCuotas.INGRESENUMEROPOLIZA.toString());
        if (verificarPoliza(numero_poliza) == -1) {
            System.out.println("La poliza no existe");
            return;
        }
        database.getPolizas()
                .stream()
                .filter(x -> x.getNumero_poliza() == numero_poliza)
                .collect(Collectors.toList())
                .get(0)
                .getCuotas()
                .forEach(System.out::println);
        ;
        Utilidades.presionarEnter();
    }

    private static void eliminarPagoCuota() {
        int numero_poliza = Utilidades.ingresarInt(MenuCuotas.INGRESENUMEROPOLIZA.toString());
        if (verificarPoliza(numero_poliza) == -1) {
            System.out.println("La poliza no existe");
            return;
        }
        int numero_cuota = Utilidades.ingresarInt(MenuCuotas.INGRESENUMEROCUOTA.toString());
        if (verificarNumeroCuota(numero_cuota, numero_poliza) == -1) {
            System.out.println("La cuota no existe");
            return;
        }
        database.getPolizas().get(numero_poliza).getCuotas().get(numero_cuota).setPagado(0);
    }
}
