package ListaEx;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;


        for (int i = 0; i < 4; i++) {
            System.out.println("Escreva um ponto X:");
            x = sc.nextInt();

            System.out.println("Escreva um ponto Y:");
            y = sc.nextInt();


            if (x > 0 && y > 0) {
                System.out.println("Primeiro Quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo quadrante");

            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro quadrante");

            } else if (x>0 && y<0) {
                System.out.println("Quarto quadrante");

            }
        }

        sc.close();
    }
}