import java.util.Scanner;

public class Tanque{
    public static void main(String[] args) {
        float media;
        int kmtotal;
        int litrostotal;

        Scanner entrada = new Scanner(System.in);
        int km = entrada.nextInt();
        int litros = entrada.nextInt();

        kmtotal = km;
        litrostotal = litros;
        
        while (km != 0 && litros != 0){

            media = km / litros;
            
            System.out.print("Consumo por tanque:");
            System.out.println(media);
            
            km = entrada.nextInt();
            litros = entrada.nextInt();
            
            litrostotal += litros;
            kmtotal += km;

            
        }
        entrada.close();

        System.out.println("km total:"+ kmtotal);
        System.out.println("Litros total:"+ litrostotal);
    }
}
