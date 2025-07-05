public class PrimeNumber {



    public static boolean DetPrime(int n){

        int aux = 0;
        if (n <= 1) return false;
 
        for (int i = 1; i <= n; i++){

            if(n % i == 0){
                aux+=1;
                if(aux > 2) return false;
                
            }        
        } 

        return true;
    }
    public static void main(String [] arg){
        for (int i = 1; i <= 100; i++) {
            if (DetPrime(i)) {
                System.out.print(i + " ");
            }
        }

    }
    
}
