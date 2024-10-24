public class PruebaHerencia {
   public static void main(String[] args){
        // Crear un objeto de tipo Perro y Gato
        Animal miPerro = new Perro("Fido");
        Animal miGato = new Gato("Michi");
        Animal miLoro = new Pajaro("Pancho");

        // Array de animales
        Animal[] animales = {miPerro, miGato, miLoro};

        // Llamar a hacerSonido() en cada uno, demostrando polimorfismo
        for (Animal animal : animales) {
            animal.hacerSonido();
        }
   } 
}
