public class Mult3{
    public static void main (String[] args){
        int num = 1;
        int cont1 = 1;
        int cont2 = 1;
        int cont3 = 1;

        while (cont1 <= 100){
            if (cont1 % 3 == 0){
                System.out.printf(cont1+" ");
            }
            cont1++;
        }

        System.out.println();

        for (; cont2 <= 100; cont2++){
            if (cont2 % 3 == 0){
                System.out.printf(cont2+" ");
            }
        }

        System.out.println();

        do{
            if (cont3 % 3 == 0){
                System.out.printf(cont3+" ");
            }
            cont3++;
        }while (cont3 <= 100);

        System.out.println();
    }
}