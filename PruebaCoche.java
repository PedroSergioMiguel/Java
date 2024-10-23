public class PruebaCoche {
    public static void main(String[] args){
        //Crear un objeto Coche
        Coche coche = new Coche("Toyota", "Ractis", 180);

        // Usar el metodo para acelerar
        coche.acelerar();

        coche.setVelocidad(250);
        System.out.println("Pero puede llegar a alcanzar " + coche.getVelocida() + " Kilometros por hora");
        coche.acelerar();

    }
}
