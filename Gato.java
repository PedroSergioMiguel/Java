public class Gato extends Animal {
    
    // Constructor que llama al constructor de la clase base
    public Gato(String nombre){
        super(nombre);
    }

    // Metodo especifico de Gato
    @Override
    public void hacerSonido() {
        System.out.println("El gato " + getNombre() + " maulla.");
    }
}
