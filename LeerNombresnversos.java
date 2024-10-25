import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class LeerNombresnversos {
    public static void main(String[] args){
        // Crear un ArrayList para almacenar los nombres
        ArrayList<String> nombres = new ArrayList<>();

        try {
            // Leer los nombres desde el archivo
            File archivos = new File("nombres.txt");
            Scanner lector = new Scanner(archivos);

            // Agregar los nombres al ArrayList
            while (lector.hasNextLine()){
                String nombre = lector.nextLine();
                nombres.add(nombre);
            }

            lector.close();
        } catch (FileNotFoundException e){
            System.out.println("Archivo no encontrado.");
            e.printStackTrace();
        }

        // Imprimir los nombres en orden inverso
        System.out.println("Nombre en orden inverso:");
        for (int i = nombres.size() -1; i >= 0; i--){
            System.out.println(nombres.get(i));
        }
    }    
}
