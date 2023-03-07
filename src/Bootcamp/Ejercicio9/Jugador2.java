package Bootcamp.Ejercicio9;

import java.io.PrintStream;

public class Jugador2 {
    String nombre2;
    boolean tiene;
    char letra;
    public Jugador2() {
    }
    /*Esta funcion analiza si la letra ingresada coincide con alguna existente en la palabra, de ser asi, retorna
     un array de guiones del mismo largo que dicha palabra con la letra ubicada en la posicion correspondiente */
    public char[] incorporaLetra (String uno, char [] palabra1, char[]palabra2){
        char uno1 = uno.toCharArray()[0];
        tiene=false;
        for (int y = 0; y < palabra1.length; y++) {
            if (palabra1[y] == uno1) {
                palabra2[y] = uno1;
                tiene=true;
            }
        }
        return palabra2;
    }
    /*Esta funcion guarda las palabras ingresadas a lo largo del juego en un fichero a modo de copia de seguridad*/
    public void guarda (PrintStream fichero,String palabra) {
        fichero.println(palabra);
    }

    public String getNombre2() {
        return nombre2;
    }
    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }
    public boolean isTiene() {
        return tiene;
    }
}
