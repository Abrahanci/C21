package B3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public  class Trabajo4 {

    public static class Estudiante {
        public Estudiante() {
        }

        String name;
        int telefono;
        int nota;

        public void setName(String name) {
            this.name = name;
        }

        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }

        public void setNota(int nota) {
            this.nota = nota;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Estudiante> estudianteList = new ArrayList<>();
        Estudiante estudiante1 = new Estudiante();
        System.out.println("Escribe el nombre del primer estudiante: ");
        estudiante1.setName(scanner.next());
        System.out.println("Digite el telefono del estudiante:");
        estudiante1.setTelefono(scanner.nextInt());
        System.out.println("Digita la primera nota del estudiante:");
        int firstnota = scanner.nextInt();
        System.out.println("Digita la segunda nota del estudiante:");
        int secodnota = scanner.nextInt();
        estudiante1.setNota((firstnota+secodnota)/2);
        //----------------------------------------------------------------
        Estudiante estudiante2 = new Estudiante();
        System.out.println("Escribe el nombre del segundo estudiante: ");
        estudiante2.setName(scanner.next());
        System.out.println("Digite el telefono del estudiante:");
        estudiante2.setTelefono(scanner.nextInt());
        System.out.println("Digita la primera nota del estudiante:");
        int firstnota2 = scanner.nextInt();
        System.out.println("Digita la segunda nota del estudiante:");
        int secodnota2 = scanner.nextInt();
        estudiante2.setNota((firstnota2+secodnota2)/2);
        //-----------------------------------------------------------------
        Estudiante estudiante3 = new Estudiante();
        System.out.println("Escribe el nombre del tercer estudiante: ");
        estudiante3.setName(scanner.next());
        System.out.println("Digite el telefono del estudiante:");
        estudiante3.setTelefono(scanner.nextInt());
        System.out.println("Digita la primera nota del estudiante:");
        int firstnota3 = scanner.nextInt();
        System.out.println("Digita la segunda nota del estudiante:");
        int secodnota3 = scanner.nextInt();
        estudiante3.setNota((firstnota3+secodnota3)/2);
        //------------------------------------------------------------
        Estudiante estudiante4 = new Estudiante();
        System.out.println("Escribe el nombre del cuarto estudiante: ");
        estudiante4.setName(scanner.next());
        System.out.println("Digite el telefono del estudiante:");
        estudiante4.setTelefono(scanner.nextInt());
        System.out.println("Digita la primera nota del estudiante:");
        int firstnota4 = scanner.nextInt();
        System.out.println("Digita la segunda nota del estudiante:");
        int secodnota4 = scanner.nextInt();
        estudiante4.setNota((firstnota4+secodnota4)/2);
        //---------------------------------------------------
        Estudiante estudiante5 = new Estudiante();
        System.out.println("Escribe el nombre del quinto estudiante: ");
        estudiante5.setName(scanner.next());
        System.out.println("Digite el telefono del estudiante:");
        estudiante5.setTelefono(scanner.nextInt());
        System.out.println("Digita la primera nota del estudiante:");
        int firstnota5 = scanner.nextInt();
        System.out.println("Digita la segunda nota del estudiante:");
        int secodnota5 = scanner.nextInt();
        estudiante5.setNota((firstnota5+secodnota5)/2);
        //----------------------------------------------------
        estudianteList.add(estudiante1);
        estudianteList.add(estudiante2);
        estudianteList.add(estudiante3);
        estudianteList.add(estudiante4);
        estudianteList.add(estudiante5);
    }

}