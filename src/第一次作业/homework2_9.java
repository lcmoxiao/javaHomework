package 第一次作业;

public class homework2_9 {
    public static void main(String[] args) {
        System.out.printf("x = %.6f",Pi());
    }

    private static double Pi() {
        double result,item;
        int denominator,sign;
        result =0;
        denominator =1;
        sign =1;
        do{
            item = (double)sign/denominator;
            result +=item;
            sign = -sign;
            denominator +=2;
        }while (Math.abs((double)sign/denominator)>=1e-6);
        return  result;
    }
}
