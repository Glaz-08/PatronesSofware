public class Main {
    public static void main(String[] args) {
        for (String arg : args) {
            NombreFactory factory;
            Nombre nome;

            // Verificar si el formato contiene una coma (formato “apellido, nombre”)
            if (arg.contains(",")) {
                factory = new ApellidoYNombre();
            } else {
                factory = new NombreYApellido();
            }

            // Crear el nombre usando la fábrica correcta
            nome = factory.crearNombre(arg);

            // Imprimir el nombre completo
            System.out.println(nome.getNomeCompleto());
        }
    }
}
