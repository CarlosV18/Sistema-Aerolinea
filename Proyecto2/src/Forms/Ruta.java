
package Forms;

public class Ruta {
 
private int /*rutasMaximas[]*/numeroVuelo,limitePrimClase,cantMaximAsientos;
private String ciudadDestino;
private double precioAsientosPrimera,precioAsientosEco,costoRuta;
private int asientos[][];

public Ruta(){
numeroVuelo=0;
limitePrimClase=0;
cantMaximAsientos=0;
ciudadDestino="Sin Nombre";
precioAsientosPrimera=0.0;
precioAsientosEco=0.0;
costoRuta=0.0;

}

/*
public void setRutasMaximas(int rm){
    rutasMaximas=new int [rm];
}

public int getRutasMaximas (){
    return rutasMaximas[];
}
*/

public void setNumeroVuelo(int nv){
    numeroVuelo=nv;
}

public int getNumeroVuelo (){
    return numeroVuelo;
}

public void setLimitePrimClase (int lmpc){
    limitePrimClase=lmpc;
}

public int getLimitePrimClase (){
    return limitePrimClase;
}

public void setCantMaximAsientos (int cma){
    cantMaximAsientos=cma;
}

public int getCantMaximAsientos (){
    return cantMaximAsientos;
}

public void setCiudadDestino (String cd){
    ciudadDestino=cd;
}

public String getCiudadDestino (){
    return ciudadDestino;
}

public void setPrecioAsientosPrimera (double pap){
    precioAsientosPrimera=pap;
}

public double getPrecioAsientosPrimera (){
    return precioAsientosPrimera;
}

public void setPrecioAsientosEco (double pac){
    precioAsientosEco=pac;
}

public double getPrecioAsientosEco(){
    return precioAsientosEco;
}
}
