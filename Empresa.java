import java.util.Scanner;

public class Empresa{
    public static void main(String[] args) {
        Funcionario func = new Funcionario();    
        Scanner entrada = new Scanner(System.in);

        // Entrada de aumento
        double aumento = entrada.nextDouble();
        if (aumento != 0)
            Funcionario.recebeAumento(func, aumento);
        
        //System.out.println(func.salario);
        System.out.println(Funcionario.calculaGanhoAnual(func));
    }
}

class Funcionario{
    String nome;
    double salario = 150.0;
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
}