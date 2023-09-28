public class principal {
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion("Artista1", "Cancion1", 3.5);
        Cancion cancion2 = new Cancion("Artista2", "Cancion2", 4.2);

        cancion1.mostrarInfo();
        cancion1.reproducir();

        System.out.println();

        cancion2.mostrarInfo();
        cancion2.reproducir();
    }
}
