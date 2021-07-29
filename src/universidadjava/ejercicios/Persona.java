package universidadjava.ejercicios;

public class Persona {
    private int id;
    private String nombre;
    private int edad;
    private static int contadorPersonas;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        Persona.contadorPersonas ++;
        this.id = Persona.contadorPersonas;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }

    public String toString(){
        return "[Nombre: " + this.nombre + ", Edad: " + this.edad +
                ", ID: " + Persona.contadorPersonas + "]";
    }
}
