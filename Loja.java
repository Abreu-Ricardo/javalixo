 import java.util.Scanner;

    public class Loja{
        public static void main(String[] args) {
            
            System.out.println("Numero de clientes -->");
            
            Scanner entrada = new Scanner(System.in);
            int num_de_clientes = entrada.nextInt();
            
            Conta cliente = new Conta(); // Criar um Vetor de objetos para os clientes
            
            for (int i = 0; i < num_de_clientes; i++){
            }
        }
    }

    class Conta{
        int Numero_da_Conta = 0;
        int Saldo_do_Mes = 0;
        int Cobranca = 0;
        int Creditos_aplicados = 0;
        int Limite = 0;

        public int novosaldo(){
            int nsaldo = 0;
            nsaldo = Saldo_do_Mes + Cobranca - Creditos_aplicados;
            return nsaldo;
        }
    }