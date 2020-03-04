package teste;

public class Funcionario{
    String nome;
    double salario; // Inicío do salário, pode alterar
    String entrada;
    String Rg;

    public static void recebeAumento(Funcionario func, double aumento){
        func.salario += aumento;
    }

    public static double calculaGanhoAnual(Funcionario func){
        double ganhoAnual;
        ganhoAnual = func.salario * 12;

        return ganhoAnual;
    }

    public static void mostra(Funcionario func){
        System.out.println(func.nome);
        System.out.println(func.salario);
        System.out.println(func.entrada);
        System.out.println(func.Rg);
    }
}