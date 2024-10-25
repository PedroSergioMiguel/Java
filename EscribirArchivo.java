import java.io.FileWriter;
import java.io.IOException;


public class EscribirArchivo {
    public static void main(String[] args){
        try {
            FileWriter escritor = new FileWriter("archivo.txt");
            escritor.write("Este es un archivo de prueba. \n");
            escritor.write("Estamos escribiendo desde Java. \n");
            escritor.close();
            System.out.println("Archivo escrito con exito");
        } catch (IOException e){
            System.out.println("Ocurrio un error al escribir el archivo");
            e.printStackTrace();
        }
    }    
}
