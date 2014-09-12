package Forms;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        System.out.println("Ingrese Cantidad de rutas maximas: ");
        int rm = lea.nextInt();
        Aerolinea x = new Aerolinea(rm);

        System.out.print("1.Crear una ruta \n2.Boleteria \n3.Despachar vuelo \n4.Reportes \n5.Usuarios "
                + "\n6.Cerrar sesion \n7.Cerrar Programa \nQue desea hacer?: ");
        int op = lea.nextInt();

        switch (op) {
            case 1:
                x.CrearRuta();
        }
    }

}
