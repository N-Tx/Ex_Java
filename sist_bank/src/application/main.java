package application;

import entity.ContaBank;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBank conta = new ContaBank();
        ContaBank conta2 = new ContaBank();
        int opc;

        System.out.println("#=#=#=#=#=#=#=#=#=#=#=#=#");
        System.out.println("  Bem vindo ao txBANK");
        System.out.println("#=#=#=#=#=#=#=#=#=#=#=#=#");
        System.out.println();



        conta.AbrirConta("CC");

        System.out.println("===============");
        conta.setDono("Nathan");
        conta.setNum_conta(10000);

        conta.estadoAtual();






        sc.close();
    }
}
