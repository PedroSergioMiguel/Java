public class Coche {
    private String  marca;
    private String modelo;
    private int velocidad;

    // Constructor
    public Coche(String marca, String modelo, int velocidad){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    // Getter para marca
    public String getMarca(){
        return marca;
    }

    // Setter para maraca
    public void setMarca(String marca){
         this.marca = marca;
    }

    // Getter para modelo
    public String getModelo(){
        return modelo;
    }

    // Setter para modelo
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    // Getter para velocidad
    public int getVelocida(){
        return velocidad;
    }

    // Setter para velocidad
    public void setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }

    // Metodo para acelerar
    public void acelerar(){
        System.out.println("Los autos de la marca "+ marca +" modelo " + modelo + " tienen una velocidad de " + velocidad + " Kilometros por hora");
    }
    
}
