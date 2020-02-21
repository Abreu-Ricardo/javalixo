import java.util.Scanner;

public class VendedorVetor{
    public static void main(String[] args) {
        int vendedores[] = new int[10];
        int campeao = -1;

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            vendedores[i] = entrada.nextInt();
            if (vendedores[i] > campeao){
                campeao = vendedores[i];
            }
        }

            System.out.println(campeao);
            entrada.close();
    }
}