package Ejercicio2;

public class Jugador2 {

    private int id;
    private boolean vivo;
    private String nombre;

    Jugador2(int id){
        this.id = id;
        this.nombre = "Jugador " + id;
        this.vivo = true;
    }
    public void disparar(Revolver2 revolver){

        System.out.println();
        System.out.println(this.nombre + " se esta apuntando");
        System.out.println(this.nombre + " disparo y...");

        if (revolver.disparoAcertado()){
            this.vivo = false;
            System.out.println(this.nombre + " se suicido");
        }else {
            System.out.println(this.nombre + " tuvo suerte, no murio.");
        }
    }
    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
