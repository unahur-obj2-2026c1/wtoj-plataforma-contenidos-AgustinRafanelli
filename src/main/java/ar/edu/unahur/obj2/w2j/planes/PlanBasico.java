package ar.edu.unahur.obj2.w2j.planes;

import java.util.List;
import ar.edu.unahur.obj2.w2j.contenidos.Contenido;
import ar.edu.unahur.obj2.w2j.plataformas.Usuario;

public class PlanBasico implements IPlan {
    private Integer limite;

    public PlanBasico(Integer limite) {
        this.limite = limite;
    }

    @Override
    public Double costoPlan(Usuario usuario) {
        Double costoBase = 10.0;
        List<Contenido> contenidosVistos = usuario.getContenidosVistos();

        if (limite >= contenidosVistos.size()) {
            return costoBase;
        } else {
            List<Contenido> contenidosExtra = contenidosVistos.subList(limite, contenidosVistos.size());
            Double costoExtra = contenidosExtra.stream().mapToDouble(Contenido::costo).sum();
            return costoBase + costoExtra;
        }
    }
    
}
