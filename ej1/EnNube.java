package ej1;

public class EnNube extends PlanBase {
    // << Atributos de Instancia >>
    protected int espacio;

    // << Constructor >>
    public EnNube(int u, int b, int e){
        super(u,b);
        espacio = e;
    }

    // << Consultas >>
    public int obtenerEspacio(){
        return espacio;
    }
    public int costoPlan(int p){
        return (espacio*p + base + usuarios);
    }
}
