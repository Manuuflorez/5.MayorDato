package pkg5.mayordato;

import java.util.Scanner;

/*Crear un algoritmo que lea un vector de tamaño N de números 
enteros y devuelva el mayor dato del vector y la posición que ocupa*/
public class MayorDato {

    public static void main(String[] args) {
        System.out.println("Cuantos numeros tendra el vector?");
        int TamanoVector = new Scanner(System.in).nextInt();
        int[] Datos = new int[TamanoVector];
        Conteo objConteo = new Conteo(Datos);
        objConteo.LlenarDatos();
        objConteo.Posicion();
    }

}
