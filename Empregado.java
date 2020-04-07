package comission;
import java.util.Scanner;
import comission.*;

public class Empregado{
    public static void main(String[] args){

        Scanner entrada1 = new Scanner(System.in);
        
        //ComissionEmployee empragado1 = new ComissionEmployee("Xablau", "Cablau", "ABRACADABRA", 1346.12, 0.12);
        //ComissionEmployee empragado1 = new ComissionEmployee(entrada1.nextLine(), entrada1.nextLine(), entrada1.nextLine(), entrada1.nextDouble(), entrada1.nextDouble());
        BasePlusComissionEmployee empregado1 = new BasePlusComissionEmployee(entrada1.nextLine(), entrada1.nextLine(), entrada1.nextLine(), entrada1.nextDouble(), entrada1.nextDouble());
        empregado1.setbaseSalary(entrada1.nextDouble());


        System.out.println(empregado1.firstName+ " "+empregado1.lastName+ " "+ empregado1.getsocialSecurityNumber() +" "+empregado1.grossSales+ " " +empregado1.comissionRate);
        System.out.println("o set aqui:"+ empregado1.getbaseSalary());
    }
}
