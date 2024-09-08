public class ApellidoYNombre extends NombreFactory {
    @Override
    public Nombre crearNombre(String entrada) {
        String[] partes = entrada.split(",");
        String sobreNombre = partes[0];
        String nombre = partes[1];
        return new Nombre(nombre, sobreNombre);
    }
}
