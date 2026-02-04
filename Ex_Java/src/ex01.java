import java.util.Scanner;

public class ex01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha = 0;

        while (senha != 2002){
            System.out.println("Digite sua senha: ");
            senha = sc.nextInt();
            if (senha != 2002){
                System.out.println("senha incorreta");
            } else {
                System.out.println("Acesso permitido");

        }

    }
    }
}