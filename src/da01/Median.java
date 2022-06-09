package da01;

import java.util.Scanner;

public class Median {
    static int med3(int a, int b, int c) {
        if (a >= b)
            if (b >= c)
                return b;
            else if (a <= c)
                return a;
            else
                return c;
        else if (a > c) // b > a > c
            return a;
        else if (b > c) // b > c > a
            return c;
        else
            return b; // c > b > a

    }


    public static void main(String[] args) {

        System.out.println("세 가지 수의 중앙값을 구합니다.");
        Scanner stdIn = new Scanner(System.in);

        System.out.println("a의 값");
        int a = stdIn.nextInt();
        System.out.println("b의 값");
        int b = stdIn.nextInt();
        System.out.println("c의 값");
        int c = stdIn.nextInt();

        System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");

    }
}