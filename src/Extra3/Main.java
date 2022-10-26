package Extra3;

import Extra3.Entidades.Database;
import Extra3.Servicios.Menu;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Menu.seleccionarGestion(db);
    }
}
