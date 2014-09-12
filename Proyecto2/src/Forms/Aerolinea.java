package Forms;

import java.util.Scanner;

public class Aerolinea {

    Scanner lea = new Scanner(System.in);
    

    //Ruta r1 = new Ruta();

    private int contadorRutas;
    private Pasajero asientos[][];
    private Ruta rutas [];
    
    

    public Aerolinea(int rm) {
        rutas = new Ruta [rm];
    }

    public boolean rutasDisponibles() {
        if (rutas[1]!=null) {
            return true;
        }
        return false;
    }
    
    
    public void CrearRuta() {
        contadorRutas++;
        int nv;
        rutas[contadorRutas]= new Ruta();
        System.out.print("Numero de vuelo: ");
        nv = lea.nextInt();
        rutas[contadorRutas].setNumeroVuelo(nv);
        
        System.out.print("Ciudad de destino: ");
        String ciud=lea.next();
        rutas[contadorRutas].setCiudadDestino(ciud);
        System.out.println("Cantidad maxima de asientos que posee: ");
        int cma=lea.nextInt ();
        asientos= new Pasajero[contadorRutas][cma];
        asientos[contadorRutas-1][contadorRutas-1]= new Pasajero ();
        System.out.print("Cantidad asientos de primera clase: ");
        int aspc=lea.nextInt();
        rutas[contadorRutas].setLimitePrimClase(aspc);
        System.out.print("Precio asientos primera clase: ");
        double pap=lea.nextDouble();
        rutas[contadorRutas].setPrecioAsientosPrimera(pap);carlos
        System.out.print("Precio asientos en clase economica: ");
        double pac=lea.nextDouble(); 
        rutas[contadorRutas].setPrecioAsientosEco(pap);
    }

}
