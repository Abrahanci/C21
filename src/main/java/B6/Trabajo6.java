package B6;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Trabajo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido Ingresa tu fecha de nacimiento en numeros y usando / (año/mes/dia)");
        String fecha = scanner.nextLine();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate fechaNac = LocalDate.parse(fecha, fmt);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNac, ahora);
        System.out.printf("Tu edad es: %s años, %s meses y %s días",
                periodo.getYears(), periodo.getMonths(), periodo.getDays());
    }
}
