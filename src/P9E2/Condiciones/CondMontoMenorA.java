package P9E2.Condiciones;
import P9E2.Gasto;

public class CondMontoMenorA implements Condicion{
    private double monto;

    public CondMontoMenorA(double m){
        monto = m;
    }

    public boolean cumple(Gasto g){
        return g.getMontoTotal() < monto;
    }
}
