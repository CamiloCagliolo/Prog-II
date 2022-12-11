package P9E2;

import java.time.Duration;
import java.time.LocalDate;

public class GastoPendiente {
    private Gasto gasto;
    private double porcentaje;
    private boolean pagado;
    private LocalDate fechaDePago;

    public GastoPendiente(Gasto g, double p){
        gasto = g;
        porcentaje = p;
    }

    public int getDias(){
        LocalDate fechaGasto = gasto.getFecha();
        LocalDate fecha;
        if(pagado){
            fecha = fechaDePago;
        }
        else{
            fecha = LocalDate.now();
        }
        return (int) Duration.between(fechaGasto, fecha).toDays();
    }

    public double getMonto(){
        double monto = gasto.getMontoTotal();
        return monto + monto * porcentaje * getDias();
    }

    public void pagar(){
        pagado = true;
        fechaDePago = LocalDate.now();
    }
}
