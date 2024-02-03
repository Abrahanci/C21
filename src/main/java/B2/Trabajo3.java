package B2;

import java.util.Scanner;
public class Trabajo3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bienvenido.Ingresa un numero: ");

        int number = scanner.nextInt();

        System.out.print((number > 0 ) ? ("El numero es positivo"):
                        (number < 0) ? ("El numero es negativo") :
                                (number == 0)? ("El numero ingresado es 0") : ("error"));



        scanner.close();
    }

}
