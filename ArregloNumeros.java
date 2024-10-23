import java.util.Scanner;

public class ArregloNumeros {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5]; //Creamos un array de 5 elementos
        
        // Pedimos al usuario que ingrese 5 numeros
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Ingresa un numero: ");
            numeros[i] = scanner.nextInt();
        }

        // Encontrar el numero mayor
        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++){
            if (numeros[i] > mayor){
                mayor = numeros[i];
            }
        }

        //Imprimimos los numeros ingresados
        System.out.println("Los numeros ingresados son: ");
        for ( int i = 0; i< numeros.length; i++){
            System.out.println(numeros[i]);
        }

        System.out.println("El numero mayor es: " + mayor);
    } 
   
}
