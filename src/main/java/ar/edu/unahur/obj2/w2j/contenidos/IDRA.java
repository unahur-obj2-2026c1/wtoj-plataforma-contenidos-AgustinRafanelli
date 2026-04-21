package ar.edu.unahur.obj2.w2j.contenidos;

public class IDRA {
	//-------- Singleton ---------
  	private static IDRA instance = new IDRA();
    private static Double valor = 0.5;

    private IDRA() {}
    
    public static IDRA getInstance() {
        return instance;
    }
	//---------------------------
    public Double getValor() {
        return valor;
    }

    public void setCanonIdra(Double nuevoValor) {
        valor = nuevoValor;
    }
}