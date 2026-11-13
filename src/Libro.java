public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }
    public boolean prestar() {
        if (this.disponible) {
            this.disponible = false;
            return true;
        }
        return false;
    }

    public void devolver() {
        this.disponible = true;
    }

    public void mostrarFicha() {
        if (this.disponible) {
            System.out.println("Libro: " + this.titulo + " (" + this.autor + ") - disponible");
        } else {
            System.out.println("Libro: " + this.titulo + " (" + this.autor + ") - prestado");
        }
    }

    public String getTitulo() {
        return this.titulo;
    }
}