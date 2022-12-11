package P9E2.Condiciones;
import P9E2.Gasto;
import java.time.LocalDate;

public class CondFecha implements Condicion{
    private LocalDate fecha;

    public CondFecha(LocalDate f){
        fecha = f;
    }

    public boolean cumple(Gasto g){
        return g.getFecha().equals(fecha);
    }
}
