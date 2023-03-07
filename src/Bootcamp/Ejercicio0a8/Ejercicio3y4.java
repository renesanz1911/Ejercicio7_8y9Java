package Bootcamp.Ejercicio0a8;

import java.util.Vector;

public class Ejercicio3y4 {
    public static void main(String[] args) {
        Vector<Integer> numeros = new Vector<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.remove(1); // uso el indice 1 en ambos casos porque el vector cambia de tamaño una
        numeros.remove(1); // vez se ejecuta el primer metodo ".remove"
        System.out.println("el vector queda: " + numeros);
    }
    /*Ejercicio 4:
    en el caso de usar la capacidad por defecto (10), y no ajustarla segun lo que necesitemos es que cuando
    dicha capacidad sea alcanzada, la misma se duplicara hasta 20, luego hasta 40, y asi sucesivamente hasta
    llegar a superar los 1000, cada vez que se realiza este proceso se crean copias temporales en la memoria
     que consumen recursos, se traduce en programas mas lentos y procesamiento de datos suboptimo.
    * */
}
