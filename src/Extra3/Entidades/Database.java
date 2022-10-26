package Extra3.Entidades;

import java.util.ArrayList;

public class Database {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private ArrayList<Poliza> polizas = new ArrayList<>();

    public Database() {
    }

    public ArrayList<Cliente> getClientes() {
        return this.clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return this.vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Poliza> getPolizas() {
        return this.polizas;
    }

    public void setPolizas(ArrayList<Poliza> polizas) {
        this.polizas = polizas;
    }

    @Override
    public String toString() {
        return "{" +
                " clientes='" + getClientes() + "'" +
                ", vehiculos='" + getVehiculos() + "'" +
                ", polizas='" + getPolizas() + "'" +
                "}";
    }
}