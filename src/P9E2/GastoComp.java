package P9E2;

import P9E2.Condiciones.Condicion;

import java.util.ArrayList;

public class GastoComp extends Gasto{
    private ArrayList<Gasto> contenido;

    public GastoComp(){
        this.contenido = new ArrayList<Gasto>();
        this.caracteristicas = new ArrayList<String>();
    }

    public void addGasto(Gasto g){
        contenido.add(g);
    }

    @Override
    public double getMontoTotal(){
        double resultado = 0;
        if(contenido.size() > 0){
            for(Gasto g : contenido){
                resultado += g.getMontoTotal();
            }
        }
        return resultado;
    }

    @Override
    public double getMontoTotal(Condicion c){
        double resultado = 0;
        if(!contenido.isEmpty()){
            for(Gasto g : contenido){
                resultado += g.getMontoTotal(c);
            }
        }
        return resultado;
    }

    @Override
    public ArrayList<Gasto> getGastosSegun(Condicion c){
        ArrayList<Gasto> resultado = new ArrayList<>();
        if(c.cumple(this)){
            resultado.add(this);
        }
        if(!contenido.isEmpty()){
            for(Gasto g : contenido){
                resultado.addAll(g.getGastosSegun(c));
            }
        }
        return resultado;
    }
}
