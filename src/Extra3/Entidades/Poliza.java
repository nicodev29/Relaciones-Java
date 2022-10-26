package Extra3.Entidades;

import java.util.ArrayList;

public class Poliza {
    private Vehiculo vehiculo;
    private Cliente cliente;
    private int numero_poliza;
    private String fecha_inicio;
    private String fecha_fin;
    private int cantidad_cuotas;
    private ArrayList<Cuota> cuotas = new ArrayList<Cuota>();
    private int monto_asegurado;
    private String tipo_cobertura;

    public Poliza(Vehiculo vehiculo, Cliente cliente, int numero_poliza, String fecha_inicio, String fecha_fin,
                  int cantidad_cuotas, int monto_asegurado, String tipo_cobertura) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.numero_poliza = numero_poliza;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.cantidad_cuotas = cantidad_cuotas;
        this.monto_asegurado = monto_asegurado;
        this.tipo_cobertura = tipo_cobertura;
        for (int i = 0; i < cantidad_cuotas; i++) {
            this.cuotas
                    .add(new Cuota(i + 1, monto_asegurado / cantidad_cuotas, fecha_inicio + " " + (i + 1) + " meses"));
        }
    }

    public Vehiculo getVehiculo() {
        return this.vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumero_poliza() {
        return this.numero_poliza;
    }

    public void setNumero_poliza(int numero_poliza) {
        this.numero_poliza = numero_poliza;
    }

    public String getFecha_inicio() {
        return this.fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return this.fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public int getCantidad_cuotas() {
        return this.cantidad_cuotas;
    }

    public void setCantidad_cuotas(int cantidad_cuotas) {
        this.cantidad_cuotas = cantidad_cuotas;
    }

    public ArrayList<Cuota> getCuotas() {
        return this.cuotas;
    }

    public void setCuotas(ArrayList<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

    public int getMonto_asegurado() {
        return this.monto_asegurado;
    }

    public void setMonto_asegurado(int monto_asegurado) {
        this.monto_asegurado = monto_asegurado;
    }

    public String getTipo_cobertura() {
        return this.tipo_cobertura;
    }

    public void setTipo_cobertura(String tipo_cobertura) {
        this.tipo_cobertura = tipo_cobertura;
    }

    @Override
    public String toString() {
        return "{" +
                " vehiculo='" + getVehiculo() + "'" +
                ", cliente='" + getCliente() + "'" +
                ", numero_poliza='" + getNumero_poliza() + "'" +
                ", fecha_inicio='" + getFecha_inicio() + "'" +
                ", fecha_fin='" + getFecha_fin() + "'" +
                ", cantidad_cuotas='" + getCantidad_cuotas() + "'" +
                ", cuotas='" + getCuotas() + "'" +
                ", monto_asegurado='" + getMonto_asegurado() + "'" +
                ", tipo_cobertura='" + getTipo_cobertura() + "'" +
                "}";
    }
}
