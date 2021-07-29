package pildorasinformaticas.ejercicios.collections;

import universidadjava.ejercicios.Cliente;

import java.util.HashSet;

public class CuentasUsuarios {

    public static void main(String[] args) {

        ClienteBanco cl1 = new ClienteBanco("Antonio Banderas", "004587785", 550000 );
        ClienteBanco cl2 = new ClienteBanco("Ricardo Echeverri", "788545879", 350000 );
        ClienteBanco cl3 = new ClienteBanco("Antonella Roccuzzo", "125654896", 878700 );
        ClienteBanco cl4 = new ClienteBanco("Alejandra Rivera", "414785698", 985441 );

        // Implemento HashSet por rapidez, no duplicación.
        HashSet <ClienteBanco> listaClientes = new HashSet<>();

        listaClientes.add(cl1);
        listaClientes.add(cl2);
        listaClientes.add(cl3);
        listaClientes.add(cl4);

        for (ClienteBanco cliente : listaClientes) {
            System.out.println(cliente.toString());
        }


    }
}
