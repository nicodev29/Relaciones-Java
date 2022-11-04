package EjercicioIntegrador1.Entidades;
public class Ticket {

    private String nombreTitular;
    private double montoAbonar;
    private int cantCuotas;
    private double montoPorCuota;

    public Ticket(String nombreTitular, double montoAbonar, int cantCuotas, double montoPorCuota) {
        this.nombreTitular = nombreTitular;
        this.montoAbonar = montoAbonar;
        this.cantCuotas = cantCuotas;
        this.montoPorCuota = montoPorCuota;
    }

    @Override
    public String toString() {
        return "Ticket {" +
                "nombreTitular='" + nombreTitular + '\'' +
                ", montoAbonar=" + montoAbonar +
                ", cantCuotas=" + cantCuotas +
                ", montoPorCuota=" + montoPorCuota +
                '}';
    }

}


