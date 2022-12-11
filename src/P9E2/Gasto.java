package P9E2;

import P9E2.Condiciones.Condicion;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Gasto {
    protected String descripcion;
    protected LocalDate fecha;
    protected ArrayList<String> caracteristicas;

    public LocalDate getFecha(){
        return fecha;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public ArrayList<String> getCaracteristicas(){
        ArrayList<String> resultado = new ArrayList<>(caracteristicas);
        return resultado;
    }

    public abstract double getMontoTotal();
    public abstract double getMontoTotal(Condicion c);
    public abstract ArrayList<Gasto> getGastosSegun(Condicion c);

    public void addCaracteristica(String s){
        if(!caracteristicas.contains(s)){
            caracteristicas.add(s);
        }
    }
}
