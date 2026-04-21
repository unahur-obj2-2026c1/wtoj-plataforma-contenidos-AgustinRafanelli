package ar.edu.unahur.obj2.w2j.contenidos;

public class Episodio extends Contenido {
    public Episodio(String titulo, double costo) {
        super(titulo, costo);
    }

    @Override
    public Double doCosto() {
        return 0.0;
    }
}
