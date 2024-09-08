public class NombreYApellido extends NombreFactory {
    @Override
    public Nombre crearNombre(String entrada) {
        String[] partes = entrada.split(" ");
        String nome = partes[0];
        String sobrenome = partes[1];
        return new Nombre(nome, sobrenome);
    }
}
