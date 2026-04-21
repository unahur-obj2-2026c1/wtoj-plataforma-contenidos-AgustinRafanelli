package ar.edu.unahur.obj2.w2j.contenidos;

public class Serie extends ContenidoConComponentes {
    public Serie(String titulo, double costo) {
        super(titulo, costo);
    }

    public void agregarTemporada(Temporada temporada) {
        this.agregarComponente(temporada);
    }
}
