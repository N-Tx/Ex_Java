
package entity;
import java.util.Random;

public class ContaBank {

    private int num_conta;
    private String type;
    private String dono;
    private double balance;
    private boolean status;

    // Construtor
    public ContaBank() {
        this.status = false;
        this.balance = 0;
    }

    // ==============================
    // MÉTODOS PRINCIPAIS
    // ==============================
    public  void estadoAtual(){
        System.out.println("conta:" +this.getNum_conta());
        System.out.println("tipo:" +this.getType());
        System.out.println("dono: " +this.getDono());
        System.out.println("SALDO:" +this.getBalance());
        System.out.println("status:" +this.isStatus());


    }
    public void AbrirConta(String t) {
        this.setType(t);
        this.setStatus(true);

        if (t.equals("CC")) {
            Depositar(50);
            System.out.println("Conta aberta com sucesso");


        } else if (t.equals("CP")) {
            Depositar(150);
        }


    }

    public void FecharConta() {
        if (this.balance != 0) {
            System.out.println("Não pode fechar conta com saldo diferente de zero.");
            return;
        }

        this.setStatus(false);
        System.out.println("Conta fechada com sucesso.");
    }

    public double Depositar(double valor) {
        if (this.isStatus()) {
            this.balance += valor;
        } else {
            System.out.println("Conta fechada. Não pode depositar.");
        }
        return valor;
    }

    public void Sacar(double valor) {
        if (this.isStatus() && this.balance >= valor) {
            this.balance -= valor;
            System.out.println("Saque realizado.");
        } else {
            System.out.println("Saldo insuficiente ou conta fechada.");
        }
    }

    public void PagarMensalidade(double mensal) {
        if (this.isStatus()) {
            this.balance -= mensal;
            System.out.println("Mensalidade paga.");
        }
    }

    // ==============================
    // GETTERS E SETTERS
    // ==============================

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
        Random rand = new Random();
        this.num_conta = rand.nextInt(9000) + 1000;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
