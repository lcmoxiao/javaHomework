package homeWork1;

import java.util.Scanner;

public class homework2_8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m,n;

        System.out.println("Enter m,n:");
        m = in.nextInt();
        n = in.nextInt();

        System.out.println(m+","+n+","+" max common divisor is "+maxCommonDivisor(m,n));
        System.out.println(m+","+n+","+" min common multiple is "+minCommonMultiple(m,n));
    }

    public  static int maxCommonDivisor(int m,int n){
        int commonDivisor = Math.min(m, n);
        while(m%commonDivisor!=0||n%commonDivisor!=0){
            commonDivisor--;
        }
        return commonDivisor;
    }

    public  static int minCommonMultiple(int m,int n){
        int CommonMultiple = Math.max(m, n);
        while(CommonMultiple%m!=0||CommonMultiple%n!=0){
            CommonMultiple++;
        }
        return CommonMultiple;
    }


}
