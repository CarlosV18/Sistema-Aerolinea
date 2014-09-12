
package Forms;

public class Pasajero {
    private String nombre, genero;
    private int edad, asiento;
    private long id;
    
    public Pasajero (){
       id=0;
       nombre="Sin Nombre";
       genero="Sin genero";
       asiento=0;
       edad=0;
    }
    public Pasajero(long id,String n, int e, String g){
        this.id = id;
        nombre =n;
        edad = e;
        genero = g;
    }
    
    
}
