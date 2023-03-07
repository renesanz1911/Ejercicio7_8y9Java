package Bootcamp.Ejercicio9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio9Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jugador1 jugador1 = new Jugador1();
        System.out.println("jugador 1 ingrese su nombre: ");
        jugador1.setNombre1(scanner.nextLine());
        Jugador2 jugador2 = new Jugador2();
        System.out.println("jugador 2 ingrese su nombre: ");
        jugador2.setNombre2(scanner.nextLine());
        PrintStream fichero = null;
        try {
            fichero = new PrintStream("/home/rene/Desktop/carpeta/ahorcado");
        } catch (FileNotFoundException e) {
            System.out.println("no se encontro el archivo" + e.getMessage());
        }
        boolean tiene;
        boolean seguir = true;
        while (seguir) {
            boolean incompleta = true;
            int c = 5;
            System.out.println(jugador1.getNombre1() + " ingrese una palabra, sin que vea " + jugador2.getNombre2());
            String palabra = scanner.nextLine();
            jugador2.guarda(fichero,palabra);
            char[] palabra1 = palabra.toCharArray();
            char[] palabra2 = jugador1.creaArrayVacio(palabra);
            while (c > 0 && incompleta) {
                incompleta = jugador1.EstaIncompleta(palabra2);
                if (incompleta) {
                    System.out.println(jugador2.getNombre2() + " ingrese una letra, que usted considere que pueda contener \r\n" +
                            "la palabra introducida por " + jugador1.getNombre1());
                    String uno = scanner.nextLine();
                    palabra2 = jugador2.incorporaLetra(uno, palabra1, palabra2);
                    tiene= jugador2.isTiene();
                }
                else {
                    System.out.println("genial, ganaste " + jugador2.getNombre2());
                    break;
                }
                if (!tiene) {
                    c--;
                    System.out.println(jugador2.getNombre2() + " te equivocaste, te quedan " + c + " vidas");
                }
                else {
                    System.out.print("bien " + jugador2.getNombre2() + ", te queda por descubrir: [");
                    System.out.print(palabra2);
                    System.out.println("]");
                }
            }

        System.out.println("desea volver a jugar?[true/false]");
        seguir = scanner.nextBoolean();
        scanner.nextLine();
        }
    }
}
