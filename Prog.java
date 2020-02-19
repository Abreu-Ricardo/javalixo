import java.util.Scanner;

public class Prog{
    public static void main(String[] args){
        int x;
        int j;
        int num;

        Scanner n = new Scanner(System.in);
        int s = n.nextInt();
        n.close();

        for(int i = 1; i <= s; i++){
            x = i;

            for (j = 1; j <= i; j++){
                
                num = x*j;
                System.out.printf(num + " ");
            }
            
            x++;
            System.out.println();
        }
    }
}
