import java.util.*;
import java.util.stream.Collectors;

public class Binary {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");

        int number = scanner.nextInt();

        scanner.close();

        ArrayList<Integer> bina = new ArrayList<>();
        ArrayList<Integer> bina2 = new ArrayList<>();

        while (number != 0 && number !=1 ){

            if(number%2 == 0){
                bina.add(0);
                number /= 2;
            }
            else{
                bina.add(1);
                number /= 2;
            }
        }
        bina.add(number);

        for (int i = bina.size() - 1; i >= 0; i--){
            bina2.add((bina.size() - 1) - i, bina.get(i));
        }
        System.out.println(bina2);

    }
    
}
