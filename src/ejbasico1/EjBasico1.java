package ejbasico1;

import java.util.Scanner;

public class EjBasico1 {
    public static void main(String[] args) {

        //Creamos el scanner para poder leer lo que el ususario introduzca por consola
        Scanner sc = new Scanner (System.in);

        //Declaramos la variable num
        int num;

        /**
         * Le pedimos al usuario que introduzca un número entero y lo guardamos en la
         *  variable antes declarada
         */
        System.out.println("Introduzca un número entero:");
        num=sc.nextInt();

        //Mostramos la variable por consola
        System.out.println("El número es:"+num);
    }
}
