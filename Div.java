public class Div{

    public static void main(String[] args) {
        int num = 1;

        while(num <= 1000000){
            if ((num % 11 == 0) && (num % 13 == 0) && (num % 17 == 0)){
                break;
            }
            num++;
        }
        System.out.println(num);
    }
}