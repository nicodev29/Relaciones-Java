package Ejercicio2;

public class Revolver2 {
    private int posicionBala;
    private int posicionActualBala;

    public Revolver2 (){
        posicionActualBala = generarNumeroAleatorio(1,6);
        posicionBala = generarNumeroAleatorio(1,6);
    }

    // creamos un metodo para generar un numero aleatorio entre 1 y 6
    // y asigunarle la posicion de la bala
    public static int generarNumeroAleatorio(int minimo, int maximo){
        int num = (int) Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
        return num;
    }

    public boolean disparoAcertado(){
        boolean acertado = false;
        if (posicionActualBala == posicionBala){
            acertado = true;
        }
        siguienteDisparo();
        return acertado;
    }
    public void siguienteDisparo(){
        if (posicionActualBala == 6){
            posicionActualBala = 1;
        }else{
            posicionActualBala++;
        }
    }

    public String toString(){
        return "Posicion actual de la bala: " + posicionActualBala + " Posicion de la bala: " + posicionBala;
    }

}
