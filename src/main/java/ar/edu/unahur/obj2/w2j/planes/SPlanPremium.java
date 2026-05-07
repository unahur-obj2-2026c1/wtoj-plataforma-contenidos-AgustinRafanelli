package ar.edu.unahur.obj2.w2j.planes;

import ar.edu.unahur.obj2.w2j.plataformas.Usuario;

public class SPlanPremium implements PlanStrategy{
    private Double costo;

    public SPlanPremium(Double costo){
        this.costo = costo;
    }

    @Override
    public Double costoPlan(Usuario usuario) {
        return this.costo;
    }
}
