package libros;

/**
 * Objeto libro
 */
public class Libro {

    /**
     * Atributos del libro
     */
    public String genero;
    public String titulo;
    public String autor;
    public int anioPublicacion;
    public int numeroPaginas;

    /**
     *
     * Cinstructor de la clabe objeto libro, permite la creación de la instancia de un nuevo libro.
     *
     * @param genero
     * @param titulo
     * @param autor
     * @param anioPublicacion
     * @param numeroPaginas
     */
    public Libro(String genero, String titulo, String autor, int anioPublicacion, int numeroPaginas) {
        this.genero = genero;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.numeroPaginas = numeroPaginas;
    }

    public Libro(){

    }

    /**
     * Estos son los get y set de los atributos, get obtiene, set modifica.
     *
     */
    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "genero='" + genero + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}
