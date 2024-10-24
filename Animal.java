public class Animal {
    private String nombre;

    // Constructor
    public Animal(String nombre){
        this.nombre = nombre;
    }

    // Metodo para obtener el nombre
    public String getNombre(){
        return nombre;
    }

    // Metodo para hacer sonido (comportamiento comun)
    public void hacerSonido() {
        System.out.println("El animal hace sonido.");
    }
}
