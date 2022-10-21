package Ejercicio3;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
    private ArrayList<Carta> mazo = new ArrayList<>();
    private ArrayList<Carta> repartidas = new ArrayList<>();

    public Baraja() {
        for (Numero num_aux : Numero.values()) {
            for (Palo palo_aux : Palo.values()) {
                this.mazo.add(new Carta(num_aux, palo_aux));
            }
        }
    }

    // • barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar() {
        Collections.shuffle(this.mazo);
    }

    // • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando
    // no haya más o
    // se haya llegado al final, se indica al usuario que no hay más cartas.
    public Carta siguienteCarta() {
        Carta siguiente_carta = this.mazo.get(0);
        this.mazo.remove(0);
        this.repartidas.add(siguiente_carta);
        if (this.cartasDisponibles() == 0) {
            System.out.println("No hay mas cartas para repartir");
        }
        return siguiente_carta;
    }

    // • cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public int cartasDisponibles() {
        return this.mazo.size();
    }

    // • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese
    // número de cartas.
    // En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
    // debemos indicárselo al usuario.
    public ArrayList<Carta> darCartas(int cantidad) {
        if (this.cartasDisponibles() >= cantidad) {
            ArrayList<Carta> reparto = new ArrayList<>();
            for (int i = 0; i < cantidad; i++) {
                reparto.add(this.siguienteCarta());
            }
            return reparto;
        }
        System.out.println();
        System.out.println("Se pidieron " + cantidad + " cartas, pero solo quedan " + this.cartasDisponibles());
        return new ArrayList<>();
    }

    // • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha
    // salido ninguna indicárselo al usuario
    public void cartasMonton() {
        if (this.repartidas.size() == 0) {
            System.out.println("No hay cartas repartidas");
            return;
        }
        System.out.println();
        System.out.println("Las cartas repartidas fueron: " + this.repartidas.size() + " cartas");
        for (Carta carta_aux : this.repartidas) {
            System.out.println(carta_aux);
        }
    }

    // • mostrarBaraja(): muestra todas las cartas hasta el final.
    // Es decir, si se saca una carta y luego se llama al método, este no mostrara
    // esa primera carta.
    public void mostrarCartas() {
        if (this.mazo.size() == 0) {
            System.out.println();
            System.out.println("No hay cartas en el mazo");
            return;
        }
        System.out.println();
        System.out.println("Las cartas que quedaron en el mazo son: " + this.mazo.size() + " cartas");
        for (Carta carta_aux : this.mazo) {
            System.out.println(carta_aux);
        }
    }
}
