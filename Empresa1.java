import java.util.Scanner;


public class Empresa{
    public static void main(String[] args) {
        Funcionario func = new Funcionario();    
        Scanner entrada = new Scanner(System.in);

        func.nome = entrada.nextLine();
        func.entrada = entrada.nextLine();
        func.Rg = entrada.nextLine();
        func.salario = entrada.nextDouble();

        // Entrada de aumento
        System.out.println("Dê o valor do aumento:");

        double aumento = entrada.nextDouble();
        if (aumento != 0)
            Funcionario.recebeAumento(func, aumento);
        
        /*System.out.println("Nome ->" + func.nome);
        System.out.println("Salario ->" + func.salario);
        System.out.println("Entrada ->" + func.entrada);
        System.out.println("Rg ->" + func.Rg);

        System.out.println("Ganho anual ->" + Funcionario.calculaGanhoAnual(func));
        */

        //Funcionario.mostra(func);
    }
}

class Funcionario{
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