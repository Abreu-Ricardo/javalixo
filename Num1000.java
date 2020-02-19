public class Num1000{
    public static void main(String[] args){
        int num = 1;
        int cont1 = num;
        int cont2 = num;
        int cont3 = num;

        int r1 = 0;
        int r2 = 0;
        int r3 = 0;

        while (cont1 <= 1000){
            r1 += cont1;
            cont1++;
        }
        System.out.printf(r1 + " ");
        
        System.out.println();
    
        for ( ; cont2 <= 1000; cont2++){
            r2 += cont2;
        }
        System.out.printf(r2 + " ");

        System.out.println();

        do{
            r3 += cont3;
            cont3++;
        }while(cont3 <= 1000);
        
        System.out.printf(r3 + " ");

        System.out.println();
    }
}
