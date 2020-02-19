public class Longfato{
    public static void main(String[] args){
        int num1 = 1;
        int num2 = 1;
        int num3 = 1;
        long r = 1;

        while (num1 < 18){
            r = r*num1;
            System.out.print(r+" ");
            num1++;
        }
        r = 1;

        System.out.println();

        for (; num2 < 18; num2++){
            r = r*num2;
            System.out.print(r+" ");
        }

        r = 1;
        System.out.println();

        do{
            r = r*num3;
            System.out.print(r+" ");
            num3++;
        }while(num3 < 18);

        System.out.println();
    }
}