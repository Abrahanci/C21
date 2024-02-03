package B1;

import java.util.Scanner;

public class Trabajo1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");

        int number1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");

        int number2 = scanner.nextInt();

        System.out.println("suma: " + (number1 + number2));
        System.out.println("resta: " + (number1 - number2));
        System.out.println("multiplicacion: " + (number1 * number2));
        System.out.println("division: " + (number1 / number2));

        scanner.close();
    }
}
