package da01;

import java.util.Scanner;

//3개의 정숫값을 입력하고 최댓값을 구합니다.


public class Max3 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        System.out.println("세 정수의 최댓값을 구합니다.");

        System.out.println("a의 값"); int a = stdIn.nextInt();
        System.out.println("b의 값"); int b = stdIn.nextInt();
        System.out.println("c의 값"); int c = stdIn.nextInt();

        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;

        System.out.printf("Max는 %d입니다.%n", max);

    }
}
