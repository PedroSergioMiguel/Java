public class Persona {
    // Atributos (variable de instancia)
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    // Metodos (comportamientos)
    public void saludar(){
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }

    // Metodo para cambiar la edad

    public void cambiarEdad(int nuevaEdad){
        edad = nuevaEdad;
    }

}
