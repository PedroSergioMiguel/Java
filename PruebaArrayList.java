import java.util.ArrayList;

public class PruebaArrayList {
    public static void main(String[] args){
        // Crear un ArrayList
        ArrayList<String> nombres = new ArrayList<>();

        // Añadir elementos al ArrayList
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Juan");

        // Imprimir los elementos
        System.out.println("Nombres en la lista");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Eliminar un elemento
        nombres.remove("Ana");

        // Imprimir la lista actualizada
        System.out.println("Nombres despues de eliminar 'Ana':");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
