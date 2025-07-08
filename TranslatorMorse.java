import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TranslatorMorse {


    public static char[] alphabet = {
                            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
                            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 
                            'u', 'v', 'w', 'x', 'y', 'z'
                            };

    public static String[] morse = {
                            ".-",    // a
                            "-...",  // b
                            "-.-.",  // c
                            "-..",   // d
                            ".",     // e
                            "..-.",  // f
                            "--.",   // g
                            "....",  // h
                            "..",    // i
                            ".---",  // j
                            "-.-",   // k
                            ".-..",  // l
                            "--",    // m
                            "-.",    // n
                            "---",   // o
                            ".--.",  // p
                            "--.-",  // q
                            ".-.",   // r
                            "...",   // s
                            "-",     // t
                            "..-",   // u
                            "...-",  // v
                            ".--",   // w
                            "-..-",  // x
                            "-.--",  // y
                            "--.."   // z
                        };
    public static String MorseSpanish(String wordMorse){
        
        List<String> bloq = List.of(wordMorse.split(" "));
        ArrayList<Character>  newBloq = new ArrayList<>();

        for(int i = 0; i < bloq.size(); i++){
            for(int j = 0 ; j < morse.length ; j++){

                if(bloq.get(i).equals(morse[j])){
                    newBloq.add(alphabet[j]);
                }

            }

        }
        String resultado = newBloq.stream()
                            .map(String::valueOf)
                            .collect(Collectors.joining());

        System.out.println(resultado);
        return resultado;

    }

    public static String SpanishMorse(String wordSpanish){
        
        ArrayList<Character> bloq = new ArrayList<>();
        ArrayList<String>  newBloq = new ArrayList<>();

        for(char c: wordSpanish.toCharArray()){
            bloq.add(c);
        }
    
        for(int i = 0; i < bloq.size(); i++){
            for(int j = 0 ; j < alphabet.length ; j++){

                if(bloq.get(i).equals(alphabet[j])){
                    newBloq.add(morse[j]);
                }

            }

        }
        String resultado = newBloq.stream()
                            .map(String::valueOf)
                            .collect(Collectors.joining());

        System.out.println(resultado);
        return resultado;


    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));

        System.out.println("Input type conversion\n"+"1.Spanish - Morse\n"+"2.Morse - Spanish");
        int option = scanner.nextInt();
        scanner.nextLine(); 
        

        switch (option) {
            case 1:
                    System.out.print("Input text Spanish: ");
                    String wordInput1 = scanner.nextLine();
                    SpanishMorse(wordInput1);
                break;

            case 2:
                    System.out.print("Input text morse: ");
                    String wordInput = scanner.nextLine();
                    MorseSpanish(wordInput);

                break;
        
            default:
                System.err.print("Error en valor de ingreso");
                break;
        } 

    scanner.close();
 
    }
    
}
