package Bootcamp.Ejercicio0a8;

public class Ejercicio2 {
    public static void main(String[] args) {

        int array2D [][]={
                {1,2,3,4,5},
                {6,7,8,9,10}
        };
        for (int i = 0; i < array2D.length; i++ ){
            for (int j = 0; j < array2D[i].length; j++){
                System.out.println("Numero: " + array2D[i][j] + ", Ubicacion: " + "[" + i + "][" + j + "]");
            }
        }
    }


}
