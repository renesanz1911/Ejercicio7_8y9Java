package Bootcamp.Ejercicio0a8;

import java.io.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        try {
            InputStream fichero1 = new FileInputStream("/home/rene/Desktop/carpeta/fileIn");
            try {
                byte[] datos = fichero1.readAllBytes();
                PrintStream fichero2 = new PrintStream("/home/rene/Desktop/carpeta/fileout");
                fichero2.write(datos);
            }
            catch(IOException e){
                System.out.println("esto es un error " + e.getMessage());
            }
        }
        catch(FileNotFoundException e){
            System.out.println("esto es otro error " + e.getMessage());
        }
    }
}
