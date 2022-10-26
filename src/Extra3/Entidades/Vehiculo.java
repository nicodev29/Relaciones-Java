package Extra3.Entidades;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private int numero_motor;
    private int numero_chasis;
    private String color;
    private String tipo;

    public Vehiculo(int numero_motor, int numero_chasis, String marca, String modelo, int año, String color,
                    String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.numero_motor = numero_motor;
        this.numero_chasis = numero_chasis;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return this.año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getNumero_motor() {
        return this.numero_motor;
    }

    public void setNumero_motor(int numero_motor) {
        this.numero_motor = numero_motor;
    }

    public int getNumero_chasis() {
        return this.numero_chasis;
    }

    public void setNumero_chasis(int numero_chasis) {
        this.numero_chasis = numero_chasis;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "{" +
                " marca='" + getMarca() + "'" +
                ", modelo='" + getModelo() + "'" +
                ", año='" + getAño() + "'" +
                ", numero_motor='" + getNumero_motor() + "'" +
                ", numero_chasis='" + getNumero_chasis() + "'" +
                ", color='" + getColor() + "'" +
                ", tipo='" + getTipo() + "'" +
                "}";
    }
}

