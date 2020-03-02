import java.util.Scanner;

public class SemSinal{
    public static void main(String[] args) {
        int num;
        int fat = 1;

        Scanner entrada = new Scanner(System.in);
        num = entrada.nextInt();

        if (num < 0){
            while (num < 0){
                num = entrada.nextInt();
            }
            entrada.close();

            for (; num >= 1; num--){
                fat *= num;
            }
        }

        else{
            for (; num >= 1; num--){
                fat *= num;
            }
        }

        System.out.println(fat);
    }
}