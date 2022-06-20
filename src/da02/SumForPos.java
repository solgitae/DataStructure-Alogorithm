package da02;

import java.util.Scanner;

//1, 2, ..., n의 합을 구합니다(양수만 입력)

public class SumForPos {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다");

        do{
            System.out.println("n의 값은: ");
            n = stdIn.nextInt();
        }while (n <= 0); //입력값이 음수이면 계속 물어봄


        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("1부터 n까지의 합은 " + sum + "입니다.");

    }
}
