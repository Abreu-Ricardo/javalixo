package teste;

import java.util.Scanner;
import teste.Funcionario;

/*Lista 2 ex 4*/

public class ComparaFunc {
    public static void main(String[] args) {
        double ganhoAnual;
        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario();

        Scanner entrada = new Scanner(System.in);

        // Entradas do Funcionário
        System.out.print("Dê os valores: Nome, Entrada No Banco, Rg e salário\n");
        func1.nome = entrada.nextLine();
        func1.entrada = entrada.nextLine();
        func1.Rg = entrada.nextLine();
        func1.salario = entrada.nextDouble();

        func2 = func1;

        if (func1 == func2)
            System.out.println("São iguais");
        else
            System.out.println("Deu ruim");

        /*
         * R = func1 e func2 são considerados iguais pq func2 recebe o enereço de func1,
         * o mesmo "aponta" para um bloco de memória contendo os valores da classe
         * Funcionario
         */
    }
}
