import java.util.Scanner;

public class DoisVendedores{
    public static void main(String[] args) {
        int vendedores[] = new int[10];
        int campeao1 = -1;
        int campeao2 = -2;


        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            vendedores[i] = entrada.nextInt();
            if (vendedores[i] > campeao1){
                if (campeao2 < campeao1){
                    campeao2 = campeao1;
                }
                campeao1 = vendedores[i];
            }
        }

            System.out.println(campeao1);
            System.out.println(campeao2);

            entrada.close();
    }
}