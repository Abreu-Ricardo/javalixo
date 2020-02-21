import java.util.Scanner;

public class Binario{
    public static void main(String[] args) {
        int numero;
        int bin[] = new int[1000];
        int binCerto[] = new int[1000];
        int cont = 0;
        int resposta = 0;
        int pot = 1;

        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();
        entrada.close();

        while (numero != 0){
            bin[cont] = numero % 10;    // Quando termina de separa, fica ao contrario
            numero /= 10;
            cont++;
        }


        for (int i = 0; i < cont; i++){
            binCerto[cont-i] = bin[i];
        }


        for (int i = 0; i <= cont; i++){
            for (int j = i; j < cont; j++){
                pot *= 2;
            }

            resposta += binCerto[i] * pot;
            pot = 1;
        }

        System.out.println(resposta);
    }
}