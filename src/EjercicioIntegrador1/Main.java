package EjercicioIntegrador1;

import EjercicioIntegrador1.Entidades.*;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Ejercicio Integrador de POO y Relaciones");
        System.out.println();


        Posnet posnet = new Posnet();
        Persona p1 = new Persona("37195218","Nicolas",
                "Garcia","152176789","nicogarcia1229@gmail.com");
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("falsoBanco","3322332",
                220000, EntidadFinanciera.MAESTROCARD,p1);

        System.out.println("Tarjeta antes del pago:");
        System.out.println(tarjeta1);
        System.out.println();

        System.out.println("Ticket tras pagar el saldo:");
        Ticket ticketGenerado = posnet.realizarPAgo(tarjeta1,15000,3);
        System.out.println(ticketGenerado);
        System.out.println();

        System.out.println("Tarjeta tras pagar una cuota:");
        System.out.println(tarjeta1);


    }
}
