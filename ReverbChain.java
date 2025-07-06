import java.util.*;
import java.util.stream.Collectors;

public class ReverbChain {

    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input word:");
        String wordOne = scanner.nextLine();

        ArrayList<String> letter = new ArrayList<>();
        ArrayList<String> letter2 = new ArrayList<>();
        

        for(char c : wordOne.toCharArray()){
            letter.add(String.valueOf(c));
        }

        for (int i = letter.size() - 1; i >= 0; i--){
            letter2.add((letter.size() - 1) - i, letter.get(i));
        }

        //////////////////////////////////////////////////////
        String textInverse = letter2.stream()
                            .map(String::valueOf)
                            .collect(Collectors.joining());
        //////////////////////////////////////////////////////


        System.out.println(textInverse);
    }

}

    

    
    


