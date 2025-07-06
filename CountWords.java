import java.util.*;

public class CountWords {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input text: ");
        String cadena = scanner.nextLine();

        scanner.close();
        
        //////////////////////////////////////////////////////
        List<String> list = List.of(cadena.split(" "));
        //////////////////////////////////////////////////////

        Map<String, Integer> conteo = new HashMap<>();

        for (String elemento : list) {
            // Si ya está la clave, incrementa el valor
            if (conteo.containsKey(elemento)) {
                conteo.put(elemento, conteo.get(elemento) + 1);
            } else {
                conteo.put(elemento, 1); // Primera vez
            }
        }

        // Mostrar el resultado
        System.out.println(conteo); // {A=3, B=2, C=1}
    }


}

