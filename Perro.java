public class Perro extends Animal {
    // Constructor que llama al contructor de la clase base
    public Perro(String nombre){
        super(nombre); // Llama al constructor de la clase Animal
    }

    // Metodo especifico de Perro
    @Override
    public void hacerSonido(){
        System.out.println("El perro " + getNombre() + " ladra.");
    }

    // Metodo adicional
    public void moverCola(){
        System.out.println("El perro " + getNombre() + " esta moviendo la cola.");
    }


}
