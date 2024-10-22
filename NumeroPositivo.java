import java.util.Scanner;

public class NumeroPositivo{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        int numero = scanner.nextInt();

        if(numero > 0){
            System.out.println("El numero es Positivo. ");
        } else if (numero < 0){
            System.out.println("El numemro es negaivo. ");
        } else {
            System.out.println("El numero es cero.");
        }

    }
}