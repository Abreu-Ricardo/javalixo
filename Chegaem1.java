import java.util.Scanner;

public class Chegaem1{
    public static void main(String[] args){
        
        Scanner entrada = new  Scanner (System.in);
        int s = entrada.nextInt();
        entrada.close();

        while (s != 1){
            if (s % 2 == 0){
                s = s/2;
            }
            else{
                s = 3*s + 1;
            }
            System.out.printf(s + " ");
        }
        System.out.println();
        System.out.println(s);
    }
}	