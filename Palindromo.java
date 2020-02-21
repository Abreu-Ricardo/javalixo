import java.util.Scanner;

public class Palindromo{
    public static void main(String[] args) {

        int flag = 1;
        String vetor;
        int tamanho;
        
        Scanner entrada = new Scanner(System.in);
        vetor = entrada.nextLine();

        tamanho = vetor.length();
        
        while (tamanho != 5){
            System.out.println("Insira um novo valor:");
            vetor = entrada.nextLine();
            tamanho = vetor.length();
        }

        for (int i = 0; i < 5; i++){
            if (vetor.charAt(i) != vetor.charAt(4-i)){
                flag = 0;
            }
        }

        if (flag == 1){
            System.out.println("Eh palidromo");
        }

        else{
            System.out.println("Nao eh palindromo");
        }
    }
}