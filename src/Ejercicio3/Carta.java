package Ejercicio3;

public class Carta {
    // Atributos
    private Numero numero;
    private Palo palo;
    public Carta(Numero numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }
    public Numero getNumero() {
        return this.numero;
    }
    public void setNumero(Numero numero) {
        this.numero = numero;
    }
    public Palo getPalo() {
        return this.palo;
    }
    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return this.getNumero().getNumero() + " de " + this.getPalo().getNombre();
    }
}
