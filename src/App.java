public class App {
    public static void main(String[] args) throws Exception {
        Libro Libro1 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez");
        Libro Libro2 = new Libro("El amor en los tiempos del colera", "Gabriel Garcia Marquez");
        Libro Libro3 = new Libro("El principito", "Antoine de Saint-Exupéry");

        Biblioteca biblioteca = new Biblioteca("Bibliteca Luis Angel Arango");
        biblioteca.agregarLibro(Libro1);
        biblioteca.agregarLibro(Libro2);
        biblioteca.agregarLibro(Libro3);

        System.out.println();
        biblioteca.mostrarCatalogo();

        biblioteca.buscarPorAutor("Gabriel Garcia Marquez");
        System.out.println();
        biblioteca.buscarPorAutor("Jorje Luis Borgues");
    }
}