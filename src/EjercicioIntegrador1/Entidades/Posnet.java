package EjercicioIntegrador1.Entidades;

public class Posnet {

    public static final double RECARGO_POR_CUOTA = 0.03;
    public static final int MIN_CANT_CUOTAS = 1;
    public static final int MAX_CANT_CUOTAS = 6;

    public Ticket realizarPAgo(TarjetaDeCredito tarjeta, double montoAbonar, int cantCuotas) {

        Ticket ticket = null;

        if (datosValidos(tarjeta, montoAbonar, cantCuotas)) {
            double montoFinal = montoAbonar + (montoAbonar * recargoSegunCuotas(cantCuotas));
            if (tarjeta.tieneSaldo(montoFinal)) {
                tarjeta.descontarSaldo(montoFinal);
                String nombreTitular = tarjeta.nombreCompleto();
                double montoPorCuota = montoFinal / cantCuotas;
                ticket = new Ticket(nombreTitular, montoAbonar, cantCuotas, montoPorCuota);
            }
        }
        return ticket;
    }

    private boolean datosValidos(TarjetaDeCredito tarjeta, double montoAbonar, int cantCuotas) {
        boolean esTarjetaValida = tarjeta != null;
        boolean esMontoValido = montoAbonar > 0;
        boolean cantCuotasValidas = cantCuotas >= MIN_CANT_CUOTAS && cantCuotas <= MAX_CANT_CUOTAS;

        return esTarjetaValida && esMontoValido && cantCuotasValidas;
    }

    private double recargoSegunCuotas(int cantCuotas) {
        return (cantCuotas - 1) * RECARGO_POR_CUOTA;
    }



}