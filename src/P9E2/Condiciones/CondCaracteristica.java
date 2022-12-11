package P9E2.Condiciones;
import P9E2.Gasto;

public class CondCaracteristica implements Condicion{
    private String caracteristica;

    public CondCaracteristica(String c){
        caracteristica = c;
    }

    public boolean cumple(Gasto g){
        return g.getCaracteristicas().contains(caracteristica);
    }
}
