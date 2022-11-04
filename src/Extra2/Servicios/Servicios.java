package Extra2.Servicios;
import Extra2.Entidades.Cine;
import Extra2.Entidades.Espectador;
import java.util.Scanner;

public class Servicios {
    public static Scanner leer = new Scanner (System.in);



    //metodo aleatorio para utilizar en metodos
    // crearEspectador, para ubicar cuando el asiento esta ocupado,
    // precioEntrada, y la pelicula que se mostrada
    //cada vez que llamemos al metodo, tenemos que pasarle por parametro el min y el max, de lo que queremos que sea aleatorio

    public static int aleatorio(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }





    //creando espectadores random
    public static Espectador crearEspectadorRandom(int minimo, int maximo) {
        String nombre = "Espectador " + aleatorio(1, minimo * maximo);
        return new Espectador(nombre, aleatorio(1, 100), aleatorio(100, 4000));
    }





    //agregar espectadores teniendo en cuenta
    // 1- edad minma  get edad minima
    // 2- dinero minimo get dinero
    // 3- que el asiento no este ocupado, en ese caso ubicarlo nuevamente - get asientos

    public static void agregarEspectadoresRandom(Cine sala, int cantidad_personas) {
        Espectador espectador;
        int filas = sala.getAsientos().length;
        int columnas = sala.getAsientos()[0].length;
        int n_fila, n_columna;
        boolean ocupado;

        for (int i = 0; i < cantidad_personas; i++) {
            espectador = crearEspectadorRandom(filas, columnas);
            if (espectador.getEdad() < sala.getPelicula().getEdadMinima()) {
                System.out.println(
                        espectador.getNombre() + " tiene " + espectador.getEdad() + " años y no cumple la edad minima");
                continue;
            }
            if (espectador.getDinero() < sala.getPrecio()) {
                System.out.println(
                        espectador.getNombre() + " tiene $" + espectador.getDinero()
                                + " pesos y no alcanza a pagar la entrada");
                continue;
            }
            System.out.println("\tIntentando ubicar a " + espectador.getNombre());
            do {
                n_fila = Servicios.aleatorio(0, filas - 1);
                n_columna = Servicios.aleatorio(0, columnas - 1);
                ocupado = sala.getAsientos()[n_fila][n_columna];
                if (ocupado)
                    System.out.println("\tAsiento ocupado, lo estamos reubicando...");
            } while (ocupado);
            System.out.println(
                    espectador.getNombre() + "\tfue ubicado en la\tfila " + (n_fila + 1) + "\tcolumna "
                            + ((char) (65 + n_columna)));
            sala.setAsiento(n_fila, n_columna, true);
        }
    }




    //contabilizar la cantidad de espectadores que no pudieron ingresar
    public static int EspectadoresNoPudieronIngresar(Cine sala) {
        int cantidad = 0;
        for (int i = 0; i < sala.getAsientos().length; i++) {
            for (int j = 0; j < sala.getAsientos()[i].length; j++) {
                if (sala.getAsientos()[i][j] == false) {
                    cantidad++;
                }
            }
        }
        return cantidad;
    }



    //contabilizar la cantidad de espectadores que pudieron ingresar
    public static int EspectadoresPudieronIngresar(Cine sala) {
        int cantidad = 0;
        for (int i = 0; i < sala.getAsientos().length; i++) {
            for (int j = 0; j < sala.getAsientos()[i].length; j++) {
                if (sala.getAsientos()[i][j] == true) {
                    cantidad++;
                }
            }
        }
        return cantidad;
    }
}
