package teste;

import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        double ganhoAnual;
        Funcionario func = new Funcionario();
        Scanner entrada = new Scanner(System.in);

        // Entradas do Funcionário
        System.out.print("Dê os valores: Nome, Entrada No Banco, Rg e salário\n");
        func.nome = entrada.nextLine();
        func.entrada = entrada.nextLine();
        func.Rg = entrada.nextLine();
        func.salario = entrada.nextDouble();

        // Entrada de aumento
        System.out.println("Dê o valor do aumento:");
        double aumento = entrada.nextDouble();
        entrada.close();

        if (aumento != 0) {
            func.recebeAumento(func, aumento);
        }

        ganhoAnual = func.calculaGanhoAnual();
        System.out.print("Ganho Anual: " + ganhoAnual + "\n");

        System.out.print("Funcionário:\n");
        func.mostra();

        /*
         * System.out.println("Nome ->" + func.nome); System.out.println("Salario ->" +
         * func.salario); System.out.println("Entrada ->" + func.entrada);
         * System.out.println("Rg ->" + func.Rg); System.out.println("Ganho anual ->" +
         * Funcionario.calculaGanhoAnual(func));
         */

        // Funcionario.mostra(func);
    }
}
