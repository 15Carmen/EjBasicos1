package ejbasico1;

import java.util.Scanner;

public class EjBasico1 {
    public static void main(String[] args) {

        //Creo el Scanner para leer por teclado
        Scanner sc = new Scanner (System.in);

        //Le pedimos el número al usuario
        System.out.println("Introduzca un número entero:");

        //Declaro la variable num donde se guarda el número introducido y lo guardo
        int num=sc.nextInt();

        //Muestro el número introducido por consola
        System.out.println("El número es:"+num);
    }
}