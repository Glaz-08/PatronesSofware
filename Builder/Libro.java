public class Libro {
    private String nombre;
    private String autores;
    private String editorial;
    private String ano;

    // Constructor privado para forzar el uso del Builder
    private Libro(String nombre, String autores, String editorial, String ano) {
        this.nombre = nombre;
        this.autores = autores;
        this.editorial = editorial;
        this.ano = ano;
    }

    // Clase interna estática Builder
    public static class Builder {
        private String nombre;
        private String autores;
        private String editorial;
        private String ano;

        public Builder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder setAutores(String autores) {
            this.autores = autores;
            return this;
        }

        public Builder setEditorial(String editorial) {
            this.editorial = editorial;
            return this;
        }

        public Builder setAno(String ano) {
            this.ano = ano;
            return this;
        }

        // Método para construir el objeto Libro
        public Libro build() {
            return new Libro(nombre, autores, editorial, ano);
        }
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", autores='" + autores + '\'' +
                ", editorial='" + editorial + '\'' +
                ", ano='" + ano + '\'' +
                '}';
    }

    // Método main para ejecutar el programa
    public static void main(String[] args) {
        // Ejemplo de uso del patrón Builder
        Libro libro = new Libro.Builder()
                .setNombre("Cien Años de Soledad")
                .setAutores("Gabriel García Márquez")
                .setEditorial("Sudamericana")
                .setAno("1967")
                .build();

        System.out.println(libro);
    }
}
