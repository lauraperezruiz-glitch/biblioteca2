public class Socio {
    private String nombre;
    private int numeroSocio;
    private Libro libroActual;

    public Socio(String nombre, int numeroSocio) {
        this.nombre = nombre;
        this.numeroSocio = numeroSocio;
        this.libroActual = null;
    }

    public void pedirLibro(Libro libro) {
        if (this.libroActual != null) {
            System.out.println(this.nombre + " ya tiene un libro: " + this.libroActual.getTitulo());
        } else {
            if (libro.prestar()) {
                this.libroActual = libro;
                System.out.println(this.nombre + " se lleva " + libro.getTitulo());
            } else {
                System.out.println(libro.getTitulo() + " no esta disponible para " + this.nombre);
            }
        }
    }

    public void devolverLibro() {
        if (this.libroActual == null) {
            System.out.println(this.nombre + " no tiene ningun libro que devolver");
        } else {
            this.libroActual.devolver();
            System.out.println(this.nombre + " devuelve " + this.libroActual.getTitulo());
            this.libroActual = null;
        }
    }
}
