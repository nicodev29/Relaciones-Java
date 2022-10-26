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
            for (int j = 0; j < asientos[i].length; j++) {
                if (asientos[i][j] == true) {
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println("");
        }
    }

    public void setAsiento(int fila, int columna, boolean b) {
        this.asientos[fila][columna] = true;
    }

    //getters y setters
    public Peliculas getPelicula() {
        return pelicula;
    }
    public void setPelicula(Peliculas pelicula) {
        this.pelicula = pelicula;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public boolean[][] getAsientos() {
        return asientos;
    }
    public void setAsientos(boolean[][] asientos) {
        this.asientos = asientos;
    }

}
