package Bootcamp.Ejercicio0a8;

import java.util.ArrayList;
import java.util.LinkedList;
public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>(4);
        lista.add("juanito");
        lista.add("pepito");
        lista.add("juanita");
        lista.add("pepita");
        LinkedList<String> listaEnlazada = new LinkedList<>(lista);

        for (String nombre: lista){
            System.out.println(nombre);
        }

        for (String nombre: listaEnlazada){
            System.out.println(nombre);
        }
    }
}
