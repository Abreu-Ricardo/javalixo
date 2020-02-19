public class Fato{
    public static void main(String[] args){
        int num1 = 1;
        int num2 = 1;
        int num3 = 1;
        int r = 1;

        while (num1 < 10){
            r = r*num1;
            System.out.print(r+" ");
            num1++;
        }
        r = 1;

        System.out.println();

        for (; num2 < 10; num2++){
            r = r*num2;
            System.out.print(r+" ");
        }

        r = 1;
        System.out.println();

        do{
            r = r*num3;
            System.out.print(r+" ");
            num3++;
        }while(num3 < 10);

        System.out.println();
    }
}
