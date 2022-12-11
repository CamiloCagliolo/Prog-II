package P9E2;
import P9E2.Condiciones.Condicion;

import java.time.LocalDate;
import java.util.ArrayList;

public class GastoInd extends Gasto{
    private double monto;

    public GastoInd(String d, LocalDate f, double m){
        descripcion = d;
        fecha = f;
        monto = m;
        caracteristicas = new ArrayList<String>();
    }

    @Override
    public ArrayList<Gasto> getGastosSegun(Condicion c){
        ArrayList<Gasto> resultado = new ArrayList<>();
        if(c.cumple(this)){
            resultado.add(this);
        }
        return resultado;
    }

    @Override
    public double getMontoTotal() {
        return monto;
    }

    @Override
    public double getMontoTotal(Condicion c){
        if(c.cumple(this)){
            return monto;
        }
        return 0;
    }
}
