import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        

        int valueFibonacci = 0;
        int aux = 0;
        int aux2 = 1;

        for (int i = 0; i < 50;i++){

            System.out.println(valueFibonacci);
            valueFibonacci = aux2 + aux;
            aux2 = aux;
            aux = valueFibonacci;
        }
        
    }
    
}
