import java.util.ArrayList;

public class FizzBuzz {

    public static void main(String[] args) {
        
        ArrayList<Object> list = new ArrayList<>();

        for (int i = 1; i <= 100; i++){
            list.add(i);
        }
        for (int j = 0; j < list.size(); j++){

            int valor = (int) list.get(j);

            if (valor % 3 == 0){
                list.set(j, "Fizz");
                if(valor % 5 == 0){
                    list.set(j, "FizzBuzz");
                 }
            }else if(valor % 5 == 0){
                list.set(j, "Buzz");
                if(valor % 3 == 0){
                    list.set(j, "FizzBuzz");
                 }
            }
        }

        for(Object data : list){
            System.out.print(data + "\n");
        }
    
    }

}