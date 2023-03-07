package Bootcamp.Ejercicio9;

public class Jugador1 {
    String nombre1;
    boolean incompleta = true;
    char vacio = '_';
    public Jugador1() {}


    /*La siguiente funcion crea un array que simula estar vacio usando los "guiones bajos" como espacios en blanco, en
    este caso "palabra2", el cual luego sera completado con las letras inttroducidas por el jugador2*/
    public char [] creaArrayVacio(String palabra){
        char[] palabra1 = palabra.toCharArray();
        char[] palabra2 = new char[palabra1.length];
        for (int i = 0; i < palabra2.length; i++) {
            palabra2[i] += vacio;
        }
        return palabra2;
    }
    /*La siguiente funcion analiza si la palabra proporcionada por el jugador1 ya ha sido completada con letras que el
    * jugador2 aporto. */
    public boolean EstaIncompleta(char [] palabra2){
        int d = 0;
        for (int x = 0; x < palabra2.length; x++) {
            if (palabra2[x] == vacio) {
                incompleta = true;
                d+=1;
            }
        }
        if (d==0) {
            incompleta = false;
        }
        return incompleta;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }
}
