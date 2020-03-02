import java.util.Scanner;

public class Min{
    public static void main(String[] args) {
        int tam;
        int vetor[] = new int[100];
        int menor = 0;

        Scanner entrada = new Scanner(System.in);
        tam = entrada.nextInt();

        for (int i = 0; i < tam; i++){
            vetor[i] = entrada.nextInt();

            if (i == 0){
                menor = vetor[i];
            }
            
            else if (vetor[i] < menor){
                menor = vetor[i];
            }
        }
    
        entrada.close();
        System.out.println(menor);
    }
}
