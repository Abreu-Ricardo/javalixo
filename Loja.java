import java.util.Scanner;

    public class Loja{
        public static void main(String[] args) {
            
           //System.out.println("Numero de clientes -->");
            
            Conta cliente = new Conta(); 
            
            Scanner entrada = new Scanner(System.in);

            cliente.Numero_da_Conta = entrada.nextInt();
            cliente.Saldo_do_Mes = entrada.nextInt();
            cliente.Cobranca = entrada.nextInt();
            cliente.Creditos_aplicados = entrada.nextInt();
            cliente.Limite = entrada.nextInt();
            
            entrada.close();
            
            int resul = Conta.novosaldo(cliente.Saldo_do_Mes, cliente.Cobranca, cliente.Creditos_aplicados);

            if (resul > cliente.Limite)
                System.out.println("Limite de credito excedido");
            
            else
                System.out.println(resul);
        }
    }

    class Conta{
        int Numero_da_Conta = 0;
        int Saldo_do_Mes = 0;
        int Cobranca = 0;
        int Creditos_aplicados = 0;
        int Limite = 0;

        public static int novosaldo(int saldo, int cobranca, int creditos){
            int nsaldo = 0;
            //System.out.print("3 coisas" + saldo + cobranca + creditos);
            System.out.println();

            nsaldo = saldo + cobranca - creditos;
            return nsaldo;
        }
    }
