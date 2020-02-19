public class Num300{
    public static void main(String[] args){
        int num = 150;
        int cont1 = num;
        int cont2 = num;
        int cont3 = num;

        while (cont1 <= 300){
            System.out.printf(cont1 + " ");
            cont1++;
        }

        System.out.println();
    
        for ( ; cont2 <= 300; cont2++){
            System.out.printf(cont2 + " ");
        }
        System.out.println();

        do{
            System.out.printf(cont3 + " ");
            cont3++;
        }while(cont3 <= 300);

        System.out.println();
    }
}