package comission;

public class ComissionEmployee{
    String firstName;
    String lastName;
    private String socialSecurityNumber;
    double grossSales;
    double comissionRate;

    ComissionEmployee(String firstName, String lastName, String socialSecurityNumber, Double grossSales, Double comissionRate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.comissionRate = comissionRate;
    }

    public void setsocialSecurityNumber(String socialSecurityNumber){
        this.socialSecurityNumber = socialSecurityNumber;
        return;
    }

    public String getsocialSecurityNumber(){
        return this.socialSecurityNumber;
    }

    public double earnings(double comissionRate, double grossSales){
        return comissionRate*grossSales;
    }

}

class BasePlusComissionEmployee extends ComissionEmployee {
    private double baseSalary;
    
    BasePlusComissionEmployee (String firstName, String lastName, String socialSecurityNumber, Double grossSales, Double comissionRate){
        super(firstName, lastName, socialSecurityNumber, grossSales, comissionRate);
    }

    public void setbaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }

    public double getbaseSalary(){
        return baseSalary;
    }

    public double earnings(double baseSalary, double comissionRate){
        return this.baseSalary + this.comissionRate;
    }
    
    public void ToString(String firstName, String lastName){
        System.out.println(firstName + lastName);
        return;
    }
}
