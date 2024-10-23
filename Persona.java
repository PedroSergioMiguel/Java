public class Persona {
    // Atributos (variable de instancia)
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getter para nombre
    public String getNombre(){
        return nombre;
    }

    // Setter para nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    // Getter para edad
    public int getEdad(){
        return edad;
    }

    // Setter para edad
    public void setEdad(int edad){
        this.edad = edad;
    }

    // Metodos (comportamientos)
    public void saludar(){
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }
}
