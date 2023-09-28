/**
 * Clase Cancion
 */
public class Cancion {

    String artista;
    String titulo;
    double duracion;

    /**
     * Constructor de la clase Cancion: Inicializa los atributos de la canción
     * @param artista
     * @param titulo
     * @param duracion
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public Cancion(String artista, String titulo, double duracion){
        this.artista = artista;
        this.titulo = titulo;
        this.duracion = duracion;
    }

    /**
     * Método que reproduce la canción
     * @return boolean: Indica si se pudo reproducir la canción
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    boolean reproducir(){
        System.out.println("Reproduciendo la canción: " + titulo + " - " + artista);
        return true;
    }

    /**
     * Método que muestra información sobre la canción
     */
    void mostrarInfo(){
        System.out.println("Artista: " + artista);
        System.out.println("Título: " + titulo);
        System.out.println("Duración: " + duracion + " minutos");
    }
}
