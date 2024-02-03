package B4;

import B3.Trabajo4;

import java.util.Scanner;

public class Trabajo5 {
    public static void main(String[] args) {
        Trabajo4.Estudiante[] miArreglo = new Trabajo4.Estudiante[5];

        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < miArreglo.length ; i++) {
            Trabajo4.Estudiante e = new Trabajo4.Estudiante();
            System.out.println("Escribe el nombre del  estudiante: ");
            e.setName(scanner.next());
            System.out.println("Digite el telefono del estudiante:");
            e.setTelefono(scanner.nextInt());
            System.out.println("Digita la primera nota del estudiante:");
            int firstnota = scanner.nextInt();
            System.out.println("Digita la segunda nota del estudiante:");
            int secodnota = scanner.nextInt();
            e.setNota((firstnota+secodnota)/2);
            miArreglo[i]=e;

        }


    }

}
