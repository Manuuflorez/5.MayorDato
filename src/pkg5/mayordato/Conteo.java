package pkg5.mayordato;

import java.util.Scanner;

/*Crear un algoritmo que lea un vector de tamaño N de números 
enteros y devuelva el mayor dato del vector y la posición que ocupa*/
public class Conteo {

    int[] Datos;

    public Conteo(int[] Datos) {
        this.Datos = Datos;
    }

    public void LlenarDatos() {
        System.out.println("Ingresa los numeros");
        for (int i = 0; i < Datos.length; i++) {
            Datos[i] = new Scanner(System.in).nextInt();
        }
    }

    public void Posicion() {
        int temporal = 0;
        int posicion = 0;
        for (int i = 0; i < Datos.length; i++) {
            if (Datos[i] > temporal) {
                temporal = Datos[i];
                posicion = i;
            }

        }
        System.out.println("El mayor dato del vector es " + temporal + " en la posicion " + posicion);
    }
}
