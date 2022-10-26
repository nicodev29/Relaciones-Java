package Extra3.Entidades;

public class Cuota {
    private int numero_cuota;
    private int monto_total;
    private int pagado;
    private String fecha_vencimiento;
    private String forma_pago;

    public Cuota(int numero_cuota, int monto_total, int pagado, String fecha_vencimiento, String forma_pago) {
        this.numero_cuota = numero_cuota;
        this.monto_total = monto_total;
        this.pagado = pagado;
        this.fecha_vencimiento = fecha_vencimiento;
        this.forma_pago = forma_pago;
    }

    public Cuota(int numero_cuota, int monto_total, String fecha_vencimiento) {
        this.numero_cuota = numero_cuota;
        this.monto_total = monto_total;
        this.pagado = 0;
        this.fecha_vencimiento = fecha_vencimiento;
        this.forma_pago = "";
    }

    public int getNumero_cuota() {
        return this.numero_cuota;
    }
    public void setNumero_cuota(int numero_cuota) {
        this.numero_cuota = numero_cuota;
    }
    public int getMonto_total() {
        return this.monto_total;
    }
    public void setMonto_total(int monto_total) {
        this.monto_total = monto_total;
    }
    public int getPagado() {
        return this.pagado;
    }
    public void setPagado(int pagado) {
        this.pagado = pagado;
    }
    public String getFecha_vencimiento() {
        return this.fecha_vencimiento;
    }
    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }
    public String getForma_pago() {
        return this.forma_pago;
    }
    public void setForma_pago(String forma_pago) {
        this.forma_pago = forma_pago;
    }

    @Override
    public String toString() {
        return "{" +
                " numero_cuota='" + getNumero_cuota() + "'" +
                ", monto_total='" + getMonto_total() + "'" +
                ", pagado='" + getPagado() + "'" +
                ", fecha_vencimiento='" + getFecha_vencimiento() + "'" +
                ", forma_pago='" + getForma_pago() + "'" +
                "}";
    }
}