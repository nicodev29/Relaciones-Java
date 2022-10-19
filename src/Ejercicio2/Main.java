package Ejercicio2;

public class Main {
    public static void main(String[] args) {

        Juego2 juego2 = new Juego2(6);

        while (!juego2.finDeJuego()){
            juego2.ronda();
        }

        System.out.println();
        System.out.println("El ''juego'' se finalizado...");
    }
}

