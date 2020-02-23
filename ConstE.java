import java.util.Scanner;

public class ConstE{
    public static void main(String[] args) {
        int num;
        double e = 1.0;
        int fat = 1;

        Scanner entrada = new Scanner(System.in);
        num = entrada.nextInt();

        entrada.close();

        while (num > 0){

            for (int i = 1; i <= num; i++){
                fat *= i;
            }
            e += 1 / fat;

            fat = 1;
            num--;
        }

        System.out.println(e);
    }
}