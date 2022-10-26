package Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Baraja baraja = Creador.crearBaraja();
        baraja.barajar();

        System.out.println("Cantidad de cartas disponibles: " + baraja.cartasDisponibles());
        baraja.cartasMonton();

        System.out.println("Cantidad de cartas disponibles: " + baraja.cartasDisponibles());
        System.out.println(baraja.siguienteCarta());

        System.out.println("Cantidad de cartas disponibles: " + baraja.cartasDisponibles());
        System.out.println(baraja.darCartas(5));

        System.out.println("Cantidad de cartas disponibles: " + baraja.cartasDisponibles());
        System.out.println("Cuantas cartas quieres repartir?");
        int cantidad = leer.nextInt();
        System.out.println("Se van a repartir " + cantidad + " cartas");
        System.out.println(baraja.darCartas(cantidad));

        System.out.println("Cantidad de cartas disponibles: " + baraja.cartasDisponibles());
        baraja.cartasMonton();
        baraja.mostrarCartas();

<<<<<<< HEAD
=======
        //actualizando el repo desde mac a git

>>>>>>> 5ac5ffb4c858585f17284120d29c7ddd14c2d4d4

    }
}
