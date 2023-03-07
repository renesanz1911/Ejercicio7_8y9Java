package Bootcamp.Ejercicio0a8;

public class Ejercicio7 {
    public static void main(String[] args) {
        try{
            System.out.println(DividePorCero(4,3));
        }
        catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }
        finally {
            System.out.println("Demo de codigo");
        }
    }
    public static int DividePorCero (int A,int B)throws ArithmeticException{
        try{
             return A/B;
        }
        catch (ArithmeticException e){
            throw new ArithmeticException();
        }
    }
}
