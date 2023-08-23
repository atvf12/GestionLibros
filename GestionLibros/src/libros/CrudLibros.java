package libros;

import java.util.ArrayList;

public class CrudLibros {

   public static ArrayList<Libro> listaLibros = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Hello world!");

        Libro libro1 = new Libro("Distopía", "1984", "George Orwell", 1949, 328);

        Libro libro2 = new Libro();
        libro2.genero = "Amor";
        libro2.titulo = "Orgullo y prejuicio";
        libro2.autor = "Jane Austen";
        libro2.anioPublicacion = 1813;
        libro2.numeroPaginas = 279;

        crearLibro(libro1);
        crearLibro(libro2);

        for (int i = 0; i < listaLibros.size(); i++){
            System.out.println("libro " + i + " " + listaLibros.get(i).toString());
        }
    }

    /**
     * Metodo para agregar un libro nuevo a la lista de libros
     * @param libro, el libro nuevo que se va a agregar
     */
    public static void crearLibro(Libro libro){
        if(libro != null){
            listaLibros.add(libro);
        }
    }

}
