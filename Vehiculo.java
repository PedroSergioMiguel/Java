public abstract class Vehiculo {
    // Atributo comun
    private String marca;

    // Constructor
    public Vehiculo(String marca){
        this.marca = marca;
    }

    // Metodo concreto
    public String getMarca(){
        return marca;
    }

    // Metodo abstract (sin implementacion)
    public abstract void conducir();
}
