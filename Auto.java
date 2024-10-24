public class Auto extends Vehiculo {
    
    // Constructor que llama al constructor de la base
    public Auto(String marca){
        super(marca);
    }

    // Implementar el metodo abstracto
    @Override
    public void conducir(){
        System.out.println("El auto de marca " + getMarca() + " esta siendo conducido.");
    }
}
