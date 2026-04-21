package ar.edu.unahur.obj2.w2j.contenidos;

public class Temporada extends ContenidoConComponentes {
    public Temporada(String titulo) {
        super(titulo, 0);
    }

    public void agregarEpisodio(Episodio episodio) {
        this.agregarComponente(episodio);
    }
}
