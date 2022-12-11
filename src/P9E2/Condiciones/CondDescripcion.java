package P9E2.Condiciones;
import P9E2.Gasto;

public class CondDescripcion implements Condicion{
    private String descripcion;

    public CondDescripcion (String d){
        descripcion = d;
    }

    public boolean cumple(Gasto g){
        return g.getDescripcion().equals(descripcion);
    }
}
