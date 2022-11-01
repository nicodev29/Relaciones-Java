package Extra2.Entidades;

import java.util.Collection;

public class Cine {
    public Peliculas pelicula;
    private int precio;
    private boolean [][] asientos; //true = ocupado, false = libre

    public Cine(Peliculas pelicula, int precio, int filas, int columnas) {
        this.pelicula = pelicula;
        this.precio = precio;
        this.asientos = new boolean[filas][columnas];
    }

    //metodo para mostrar el estado de los asientos
    public void mostrarAsientos() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[j].length; j++) {
                if (asientos[i][j] == true) {
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }


    //getters y setters
    public void setAsiento(int fila, int columna, boolean b) {
        this.asientos[fila][columna] = true;
    }
    public Peliculas getPelicula() {
        return pelicula;
    }
    public int getPrecio() {
        return precio;
    }
    public boolean[][] getAsientos() {
        return asientos;
    }

}
