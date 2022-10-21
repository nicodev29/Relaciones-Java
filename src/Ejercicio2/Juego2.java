package Ejercicio2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class Juego2 {
    private HashSet<Jugador2> jugadores2;
    private Revolver2 revolver2;
    public Juego2(int numJugadores) {

        if (!(numJugadores >= 1 && numJugadores <= 6)){
            numJugadores = 6;
        }
        llenarJugadores(numJugadores);
        revolver2 = new Revolver2();

    }
    //llenar el arraylist con los jugadores
    public void llenarJugadores(int numJugadores){
        jugadores2 = new HashSet<Jugador2>();
        for (int i = 0; i < numJugadores; i++) {
            jugadores2.add(new Jugador2(i));
        }
        System.out.println();
        System.out.println("Se crearon " + numJugadores + " jugadores");
    }
    public boolean finDeJuego () {

        for (Jugador2 jugador2 : jugadores2) {
            if (!jugador2.isVivo()) {
                return true;
            }
        }
        return false;
    }
    public void ronda (){
        for (Jugador2 jugador2 : jugadores2) {
            jugador2.disparar(revolver2);
            if (finDeJuego()){
                break;
            }
        }
    }

}
