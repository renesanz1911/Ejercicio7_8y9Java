package Bootcamp.Ejercicio0a8;

public class Ejercicio0 {
    public static void main(String[] args) {
        System.out.println(reverse("Hola Mundo."));
    }
    public static String reverse (String texto){
        String texto1 ="";
        for (int i=texto.length()-1; i >= 0 ;i--){
            texto1+=texto.charAt(i);
        }
        return texto1;
    }
}
