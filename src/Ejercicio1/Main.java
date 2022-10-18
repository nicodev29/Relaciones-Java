package Ejercicio1;
import java.util.ArrayList;

public class Main {

    final static int CANTIDAD_PERSONAS = 2;

    public static void main(String[] args) {

        Creador creador = new Creador ();
        ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<Perro> perros = new ArrayList<>();

        for (int i = 0; i < CANTIDAD_PERSONAS; i++) {
            System.out.println("Ingrese los datos de la persona: " + (i + 1));
            personas.add(creador.crearPersona());
            System.out.println("Ingrese los datos del perro de: " + personas.get(i).getNombre());
            perros.add(creador.crearPerro());
            personas.get(i).setPerro(perros.get(i));
        }

        for (int i = 0; i < CANTIDAD_PERSONAS; i++) {
            System.out.println();
            System.out.println("Nombre de la persona: " + personas.get(i).getNombre());
            System.out.println("Apellido: " + personas.get(i).getApellido());
            System.out.println("Edad: " + personas.get(i).getEdad());
            System.out.println("Documento: " + personas.get(i).getDocumento());
            System.out.println();
            System.out.println("Nombre del perro: " + personas.get(i).getPerro().getNombre());
            System.out.println("Raza del perro: " + personas.get(i).getPerro().getRaza());
            System.out.println("Edad del perro: " + personas.get(i).getPerro().getEdad());
            System.out.println("Tamaño del perro: " + personas.get(i).getPerro().getTamano());
        }

    }
}
