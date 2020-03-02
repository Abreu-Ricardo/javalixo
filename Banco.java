import java.util.Scanner;

public class Banco{
    public static void main(String[] args) {
        Conta fulano = new Conta();
        Conta contas[];
        contas = new Conta[5]; 
        // Eh igual a -> Conta conta0, conta1, conta2, conta3, conta4;

        for (int i = 0; i < 5; i++){
            //cont[i] = new Conta();
            
            if (i == 0)
                contas[0] = new Conta();

            else
                contas[i] = contas[0];
        }
        contas[1].numero=3;
        System.out.println(contas[0].numero);
        System.out.println(contas[1].numero);
    }
}

class Conta{
    int numero=1;
    String nome;
    double saldo = 5.0;
    double limite;
}
