import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class LeerArchivo {
    public static void main(String[] args){
        try {
            File archivo = new File("archivo.txt");
            Scanner lector = new Scanner(archivo);

            while ( lector.hasNextLine()) {
                String linea = lector.nextLine();
                System.out.println(linea);
            }

            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
            e.printStackTrace();
        }
    }    
}
