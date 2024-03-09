import Entidades.Persona;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Persona> listPersonas = new ArrayList<>();

        Persona p1 = new Persona("Juan", "Perez");
        Persona p2 = new Persona("Jose", "Dominguez");
        Persona p3 = new Persona("Lucas", "Rodriguez");
        Persona p4 = new Persona("Pedro", "Lopez");
        Persona p5 = new Persona("Abel", "Gonzalez");

        listPersonas.add(p1);
        listPersonas.add(p2);
        listPersonas.add(p3);
        listPersonas.add(p4);
        listPersonas.add(p5);

        Collections.sort(listPersonas);

        System.out.println("Ordenado por Apellido A->Z:");
        for (Persona p : listPersonas) {
            System.out.println(p);
        }
        System.out.println();

        Collections.sort(listPersonas, (persona1, persona2)-> persona1.getNombre().compareTo(persona2.getNombre()));

        System.out.println("Ordenado por Nombre");
        for (Persona p : listPersonas) {
            System.out.println(p);
        }
        System.out.println();

        Collections.sort(listPersonas, Collections.reverseOrder());
        System.out.println("Ordenado por Apellido de Z->A");
        for (Persona p : listPersonas) {
            System.out.println(p);
        }

    }
}