package universidadjava.ejercicios;

public class PruebaPersonas{
    public static void main(String[]args){
        Persona persona1 = new Persona("Natalia Pulgarin", 34);
        System.out.println(persona1);

        Persona persona2 = new Persona("Alejandro Gonzáles", 42);
        System.out.println(persona2);

        Cliente cliente1 = new Cliente("Paola Guerra",40, true);
        System.out.println(cliente1);

        Cliente cliente2 = new Cliente("Andrés Cadavid",22, false);
        System.out.println(cliente2);

    }
}
