package Bootcamp.Ejercicio0a8;

import java.util.ArrayList;
public class Ejercicio6 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i<=10; i++){
            numeros.add(i);
        }
        for (int i=0;i<numeros.size();i++){
            if (numeros.get(i)%2==0){
                numeros.remove(i);
            }
            if (i<numeros.size()){
                System.out.println(numeros.get(i));
            }
        }
    }
}
