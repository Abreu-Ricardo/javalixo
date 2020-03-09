package Demo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Pessoa truta = new Pessoa();
        Scanner entrada = new Scanner(System.in);
        int i = 0;
        System.out.println("Qual o seu nome e idade");

        // Entrada dos dados
        truta.nome = entrada.nextLine();
        truta.idade = entrada.nextInt();

        for (i = 0; i < 5; i++) {

            System.out.println("Quê dia e mês estamos hoje?");
            int dia = entrada.nextInt();
            int mes = entrada.nextInt();

            truta.fazAniversario(dia, mes);
        }
    }
}