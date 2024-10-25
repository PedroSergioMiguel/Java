import java.util.Scanner;

public class ManejoExcepciones {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el numerador: ");
            int numerador = scanner.nextInt();

            System.out.print("Ingresa el denominador: ");
            int denominador = scanner.nextInt();

            // Intentar dividir
            int resultado = numerador / denominador;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e){
            // Capturar el error de division por cero
            System.out.println("Error: No se puede dividir por cero");
        }
    }
}
