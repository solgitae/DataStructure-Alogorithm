package da09;

import java.util.Scanner;

//팩토리얼을 재귀적으로 표현

public class Factorial {

    static int factorial(int n) {
        if (n > 0) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("정수를 입력하세요.: ");
        int x = stdIn.nextInt();

        System.out.println("x의 팩토리얼은 " + factorial(x) + " 입니다.");
    }
}
