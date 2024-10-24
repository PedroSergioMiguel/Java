public class PruebaHerencia {
   public static void main(String[] args){
        // Crear un objeto de tipo Perro
        Perro miPerro = new Perro("Fido");

        // Llamar a metodo de la clase base y de la clase hijo
        miPerro.hacerSonido(); // Este metodo ha sido sobreescrito
        miPerro.moverCola();   // Metodo esoecifico
   } 
}
