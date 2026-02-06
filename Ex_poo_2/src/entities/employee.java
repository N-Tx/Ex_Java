package entities;

public class employee {
    public String name;
    public float gross_salary;
    public double tax = 1000;
    public double taxação;

    public double netSalary(){
        return gross_salary - tax;
    }
    public void increaseSalary(double percentage){
    this.gross_salary += this.gross_salary * percentage / 100;
    }
}


