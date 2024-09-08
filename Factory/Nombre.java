public class Nombre {
    private String nombre;
    private String sobreNombre;

    public Nombre(String nombre, String sobreNombre) {
        this.nombre = nombre;
        this.sobreNombre = sobreNombre;
    }

    public String getNomeCompleto() {
        return nombre + " " + sobreNombre;
    }
}
