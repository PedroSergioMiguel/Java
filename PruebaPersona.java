public class PruebaPersona {
    public static void main(String[] args) {
        // Crear un objeto Persona
        Persona persona1 = new Persona("Pedro", 31);

        // Usar el metodo para saludar
        persona1.saludar();

        // Cambiar el nombre y la edad usando setters
        persona1.setNombre("Pedro");
        persona1.setEdad(32);

        // Imprimir los nuevos valores usando getters
        System.out.println("Nombre actualizado: " + persona1.getNombre());
        System.out.println("Edad actualizado: " +persona1.getEdad());

        // Saludar nuevamente
        persona1.saludar();
    }
}
