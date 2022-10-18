package Ejercicio1;
import java.util.Scanner;

public class Creador {
    private Scanner leer = new Scanner(System.in);
    public Persona crearPersona(){
        Persona persona = new Persona();
        System.out.println();
        System.out.println("Ingrese el nombre de la persona");
        persona.setNombre(leer.next());
        System.out.println("Ingrese el apellido de la persona");
        persona.setApellido(leer.next());
        System.out.println("Ingrese la edad de la persona");
        persona.setEdad(leer.nextInt());
        System.out.println("Ingrese el documento de la persona");
        persona.setDocumento(leer.nextInt());
        return persona;
    }
    public Perro crearPerro() {
        System.out.println();
        System.out.println("Ingrese el nombre del perro");
        String nombre = leer.next();
        System.out.println("Ingrese la raza del perro");
        String raza = leer.next();
        System.out.println("Ingrese la edad del perro");
        int edad = leer.nextInt();
        System.out.println("Ingrese el tamaño del perro");
        float tamano = leer.nextFloat();
        return new Perro(nombre, raza, edad, tamano);
    }
}
