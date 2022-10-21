package Ejercicio3;

public enum Palo {
    ORO("Oro"), ESPADA("Espada"), BASTO("Basto"), COPA("Copa");

    private String nombre;
    Palo(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
}
