public class Somasem5{
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 0; i < 100; i++){
            if (i % 5 == 0){
                continue;
            }
            soma = soma + i;
            /*System.out.println(i);*/
        }
        System.out.println(soma);
    }
}