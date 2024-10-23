public class PruebaPersona {
    public static void main(String[] args) {
        // Crear un objeto Persona
        Persona persona1 = new Persona("Pedro", 32);

        // Llamar a los metodos del objeto
        persona1.saludar();

        // Cambiar la edad y volver a saludar
        persona1.cambiarEdad(33);
        persona1.saludar();
    }
}
