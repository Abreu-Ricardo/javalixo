import java.util.Scanner;


public class Funcionario{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num = entrada.nextInt();
        
        func mano = new func();

        mano.hora_extra = entrada.nextInt();
        mano.salario_hora = entrada.nextInt();
        
        float resultado = func.salario(mano.salario_hora, mano.hora_extra);
        System.out.println(resultado);

        while (num > 0){
            mano.hora_extra = entrada.nextInt();
            mano.salario_hora = entrada.nextInt();

            resultado = func.salario(mano.salario_hora, mano.hora_extra);
            System.out.println(resultado);
            num--;
        }

    }
}

class func{
    int hora_extra;
    int salario_hora;

    public static float salario(int salario_hora , int hora_extra){

        float dinheiro = (salario_hora * 40);
        dinheiro += dinheiro*0.5;
        return dinheiro;
    }
}