package Extra3.Servicios;
import Extra3.Entidades.*;
import Extra3.Enum.*;


public class Menu {
    public static void seleccionarGestion(Database db) {
        while (true) {
            switch (MenuPrincipal.MENU.seleccion()) {
                case 0:
                    return;
                case 1:
                    seleccionarGestionClientes(db);
                    break;
                case 2:
                    seleccionarGestionVehiculos(db);
                    break;
                case 3:
                    seleccionarGestionPolizas(db);
                    break;
                case 4:
                    seleccionarGestionCuotas(db);
                    break;
            }
        }
    }

    public static void seleccionarGestionClientes(Database db) {
        while (GestionClientes.opcion(db, MenuClientes.MENU.seleccion()))
            ;
    }

    public static void seleccionarGestionVehiculos(Database db) {
        while (GestionVehiculos.opcion(db, MenuVehiculos.MENU.seleccion()))
            ;
    }

    public static void seleccionarGestionPolizas(Database db) {
        while (GestionPolizas.opcion(db, MenuPolizas.MENU.seleccion()))
            ;
    }

    public static void seleccionarGestionCuotas(Database db) {
        while (GestionCuotas.opcion(db, MenuCuotas.MENU.seleccion()))
            ;
    }
}
