public class Pajaro extends Animal {
    
    //Contructor que llama al constructor de la clase base
    public Pajaro(String nombre){
        super(nombre);
    }

    // Metodo especifico de Pajaro
    @Override
    public void hacerSonido(){
        System.out.println("El Loro " + getNombre() + " es muy charlatan.");
    }
}
