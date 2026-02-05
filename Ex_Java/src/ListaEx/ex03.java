package ListaEx;

import java.util.Scanner;

public class ex03 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        int gasolina = 0;
        int alcool = 0;
        int gas = 0;
        while (opc != 4){
            System.out.println("==== POSTO DE COMBUSTÍVEL====");
            System.out.println("Digite a opção da gasolina a ser abastecido");
            System.out.println("1-Ácool");
            System.out.println("2-Gasolina");
            System.out.println("3-Gás");
            System.out.println("4-Sair");
            System.out.println("==== FIM ====");

            opc = sc.nextInt();

            if (opc == 1){
                alcool++;

            } else if (opc == 2) {
                gasolina++;
            } else if (opc == 3) {
                gas++;
            } else if (opc == 4){
                break;
            }

        }
        System.out.println("Álcool:" + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Gas:" + gas);


        }

}
