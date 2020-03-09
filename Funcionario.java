package teste;

public class Funcionario {
    String nome;
    double salario; // Inicío do salário, pode alterar
    String entrada;
    String Rg;

    Funcionario() {
        this.salario = 1045.0;
    }

    void recebeAumento(Funcionario func, double aumento) {
        func.salario += aumento;
    }

    double calculaGanhoAnual() {
        double ganhoAnual;
        ganhoAnual = this.salario * 12;

        return ganhoAnual;
    }

    void mostra() {
        System.out.println(nome);
        System.out.println(salario);
        System.out.println(entrada);
        System.out.println(Rg);
    }
}