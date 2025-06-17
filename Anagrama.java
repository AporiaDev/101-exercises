import java.util.*;

public class Anagrama {

    public static void main(String arg[]){

        Scanner scanner = new Scanner(System.in);
        List<String> letter = new ArrayList<>();
        List<String> letterTwo = new ArrayList<>();

        System.out.print("Input firts word:");
        String wordOne = scanner.nextLine();

        System.out.print("Input second word:");
        String wordTwo = scanner.nextLine();

        //En Java, == no compara el contenido de las cadenas, sino sus referencias en memoria. Para comparar el contenido de dos String, debes usar:
        if (wordOne.equals(wordTwo)){
            System.out.println(false);
        }else{

            //toCharArray()
            for (char data : wordOne.toCharArray()){
                letter.add(String.valueOf(data));
        }
            for (char data : wordTwo.toCharArray()){
                letterTwo.add(String.valueOf(data));
        }
        int aux = 0;
        for(int i = 0; i < letter.size(); i++){
            for(int j =0; j < letterTwo.size(); j++){
                if (letter.get(i).equals(letterTwo.get(j))){
                    aux += 1;
                    break;
                }else{
                    continue;
                }
            }
        }
        if (aux == 4){
            System.out.println(true);
        }else if(aux < 4){
            System.out.println(false);
        }else{
            System.err.println("Value aux exceeds");
        }
           
        }

        //Una vez que cierras el Scanner, no puedes volver a usar System.in con otro Scanner en el mismo programa. Eso puede causar errores como java.util.NoSuchElementException
        scanner.close();

        
        //(!wordOne.equals(wordTwo))
 

    }
    
}
