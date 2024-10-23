import java.util.Scanner;

public class Operaciones {
   
    //MEtodo para sumar
    public static int sumar(int a, int b){
        return a + b;
    }

    //Metodo para restar
    public static int restar(int a, int b){
        return a - b;
    }

    // Metodo para multiplicar
    public static int multiplicar(int a, int b){
        return a * b;
    }

    // Metodo para dividir
    public static double dividir(int a, int b){
        return a / b;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Igresa el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        int num2 = scanner.nextInt();

        // Llamar a los metodos
        int suma = sumar(num1, num2);
        int resta = restar(num1, num2);
        int multiplicacion  = multiplicar(num1, num2);
        double division = dividir(num1, num2);

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion );
        System.out.println("La division es: " + division);
    }
}
