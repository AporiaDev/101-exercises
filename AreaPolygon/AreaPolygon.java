package AreaPolygon;
import java.util.Scanner;

public class AreaPolygon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("***********************************************\n" +
                 "Ingrese el Polígono al cual desea calcularle el área\n" +
                 "\t1. Triángulo\n" +
                 "\t2. Cuadrado\n" +
                 "\t3. Rectángulo\n" + 
                 "Opcion: ");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el lado 1: ");
                float a = scanner.nextFloat();
                System.out.print("Ingrese el lado 2: ");
                float b = scanner.nextFloat();
                System.out.print("Ingrese el lado 3: ");
                float c = scanner.nextFloat();

                Triagle triangulo = new Triagle(a,b,c);
                
                System.out.println("El area de su poligono es: " + triangulo.calcArea());

                break;

            case 2:
                System.out.print("Ingrese el lado: ");
                float n = scanner.nextFloat();

                Square square = new Square(n);
                System.out.println("El area de su poligono es: " + square.calcArea());

                break;

            case 3:
                System.out.print("Ingrese la base: ");
                float n1 = scanner.nextFloat();
                System.out.print("Ingrese la altura: ");
                float n2= scanner.nextFloat();

                Rectangle rectangulo = new Rectangle(n1,n2);
                System.out.println("El area de su poligono es: " + rectangulo.calcArea());

                break;
            
        
            default:
                System.out.println("Ingrese una opcion valida");

                break;
        }

    }
    
}
