package P9E2.Condiciones;
import P9E2.Gasto;

public class CondCompuestaO implements Condicion{
    private Condicion c1;
    private Condicion c2;

    public CondCompuestaO(Condicion c1, Condicion c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    public boolean cumple(Gasto g){
        return c1.cumple(g) || c2.cumple(g);
    }
}
