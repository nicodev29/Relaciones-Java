package Extra3.Entidades;

import Extra3.Enum.MenuClientes;
import Extra3.Servicios.Utilidades;

public class GestionClientes {
    private static Database database;

    public static boolean opcion(Database db, int opcion) {
        database = db;
        switch (opcion) {
            case 0:
                return false;
            case 1:
                agregarCliente();
                break;
            case 2:
                modificarCliente();
                break;
            case 3:
                eliminarCliente();
                break;
            case 4:
                mostrarClientes();
                break;
            default:
                System.out.println("Ingrese una opcion valida");
        }
        return true;
    }

    private static int verificarCliente(int documento) {
        int posicion = 0;
        for (Cliente cliente : database.getClientes()) {
            if (cliente.getDni() == documento)
                return posicion;
            posicion++;
        }
        return -1;
    }

    private static void agregarCliente() {
        int documento = Utilidades.ingresarInt(MenuClientes.INGRESEDOCUMENTO.toString());
        if (verificarCliente(documento) == -1) {
            database.getClientes()
                    .add(new Cliente(Utilidades.ingresarString(MenuClientes.INGRESENOMBRE.toString()),
                            Utilidades.ingresarString(MenuClientes.INGRESEAPELLIDO.toString()),
                            documento,
                            Utilidades.ingresarString(MenuClientes.INGRESEMAIL.toString()),
                            Utilidades.ingresarString(MenuClientes.INGRESEDOMICILIO.toString()),
                            Utilidades.ingresarString(MenuClientes.INGRESETELEFONO.toString())));
        } else {
            System.out.println("El cliente ya existe");
            Utilidades.presionarEnter();
        }
    }

    private static void mostrarClientes() {
        for (Cliente cliente : database.getClientes()) {
            System.out.println(cliente);
        }
        Utilidades.presionarEnter();
    }

    private static void modificarCliente() {
        int documento = Utilidades.ingresarInt(MenuClientes.INGRESEDOCUMENTO.toString());
        int posicion = verificarCliente(documento);
        if (posicion == -1) {
            System.out.println("El cliente no existe");
            Utilidades.presionarEnter();
        } else {
            Cliente cliente = database.getClientes().get(posicion);
            cliente.setDni(Utilidades.ingresarInt(MenuClientes.INGRESEDOCUMENTO.toString()));
            cliente.setNombre(Utilidades.ingresarString(MenuClientes.INGRESENOMBRE.toString()));
            cliente.setApellido(Utilidades.ingresarString(MenuClientes.INGRESEAPELLIDO.toString()));
            cliente.setDomicilio(Utilidades.ingresarString(MenuClientes.INGRESEDOMICILIO.toString()));
            cliente.setEmail(Utilidades.ingresarString(MenuClientes.INGRESEMAIL.toString()));
            cliente.setTelefono(Utilidades.ingresarString(MenuClientes.INGRESETELEFONO.toString()));
        }
    }

    private static void eliminarCliente() {
        int documento = Utilidades.ingresarInt(MenuClientes.INGRESEDOCUMENTO.toString());
        if (!database.getClientes().removeIf(x -> x.getDni() == documento))
            System.out.println("El cliente no existe");
    }
}
