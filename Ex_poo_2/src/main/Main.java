package main;

import java.util.Scanner;
import entities.employee;



public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float newsalary;
        employee empo = new employee();

        System.out.println("Digite seu Nome; ");
        empo.name = sc.nextLine();
        System.out.println("Digite seu salário; ");
        empo.gross_salary = sc.nextFloat();

        System.out.println("Seu nome é: " + empo.name);
        System.out.printf("Seu salário líquido é: %.2f%n ", empo.netSalary());

        System.out.println("Digite a porcentagem para aumentar salario: ");
        double percentage = sc.nextDouble();
        System.out.println();
        empo.increaseSalary(percentage);
        System.out.printf("Dados atualizados: %s, $ %.2f%n", empo.name, empo.netSalary());

    }
}
