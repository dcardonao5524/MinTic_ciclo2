package pildorasinformaticas.ejercicios.collections;

public class ClienteBanco {

    public ClienteBanco(String nombre, String noCuenta, double saldo){
        this.nombre = nombre;
        this.noCuenta = noCuenta;
        this.saldo = saldo;
    }

    private String nombre;
    private String noCuenta;
    private double saldo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ClienteBanco{" +
                "nombre='" + nombre + '\'' +
                ", noCuenta='" + noCuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
