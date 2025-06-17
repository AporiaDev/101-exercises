import java.util.*;

public class Anagrama {

    public static void main(String arg[]){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input firts word:");
        String wordOne = scanner.nextLine();

        System.out.print("Input second word:");
        String wordTwo = scanner.nextLine();

        if (anagramaTrueFalse(wordOne, wordTwo)){
            System.out.println("Es un Anagrama");
        }else{
            System.out.println("No es un Anagrama");
        }

        //Una vez que cierras el Scanner, no puedes volver a usar System.in con otro Scanner en el mismo programa. Eso puede causar errores como java.util.NoSuchElementException
        scanner.close();

        }
        public static boolean anagramaTrueFalse(String wordOne , String wordTwo){

            List<String> letter = new ArrayList<>();
            List<String> letterTwo = new ArrayList<>();
            String[] alfabeto = {
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", 
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
            };
            List<String> newLetter = new ArrayList<>();
            List<String> newLetterTwo = new ArrayList<>();

            //toCharArray()
            for (char data : wordOne.toCharArray()){
                letter.add(String.valueOf(data));
            }
            for (char data : wordTwo.toCharArray()){
                    letterTwo.add(String.valueOf(data));
            }
            //En Java, == no compara el contenido de las cadenas, sino sus referencias en memoria. Para comparar el contenido de dos String, debes usar:
            if (letter.size() != letterTwo.size()){
                return false;
                
            }else if(letter.equals(letterTwo)){
                return false;
            }
            else{
                for(int i = 0; i < letter.size(); i++){
                    for(int j =0; j < letter.size(); j++){
                        if (alfabeto[i].equals(letterTwo.get(j))){
                            newLetterTwo.add(alfabeto[i]);
                        }else if((alfabeto[i].equals(letter.get(j)))){
                            newLetter.add(alfabeto[i]);
                        }else{
                            continue;
                        }
                    }
                }
                return newLetter.equals(newLetterTwo);

            }
        }
                //(!wordOne.equals(wordTwo))
 

    }
    

