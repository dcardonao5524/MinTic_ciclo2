package universidadjava.ejercicios;

import java.util.*;

public class Cliente extends Persona {

    public Cliente(String nombre, int edad, boolean isVip) {
        super(nombre, edad);
        Cliente.contadorCliente++;
        this.setId(Cliente.contadorCliente);
        this.vip = isVip;
    }

    private GregorianCalendar fechaRegistro = new GregorianCalendar(2021, Calendar.JULY, 28, 16, 53);
    private boolean vip;
    private static int contadorCliente;

    public int getContadorCliente() {
        return contadorCliente;
    }

    public boolean isVip(){
        return this.vip;
    }

    @Override
    public String toString() {
        return "Cliente{ Nombre: " + this.getNombre() + ", Edad: " + this.getEdad() +
                ", Id: " + this.getContadorCliente()+
                ", Fecha registro: " + fechaRegistro.getTime()  +
                ", VIP: " + this.isVip();
    }
}

