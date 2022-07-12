package da09;

import da07.IntStack;

import java.util.Scanner;

public class Recur {

//    static void recur(int n) {
//        if(n > 0) {
//            recur(n - 1);
//            System.out.println(n);
//            recur(n - 2);
//        }
//    }

//    //꼬리 재귀를 제거했습니다. V1
//    static void recur(int n) {
//        while(n > 0){
//            recur(n - 1);
//            System.out.println(n);
//            n = n - 2;
//        }
//    }

    static void recur(int n) {
        IntStack s = new IntStack(n);

        while (true) {
            if (n > 0) {
                s.push(n);
                n = n - 1;
                continue;
            }
            if (s.isEmpty() != true) {
                n = s.pop();
                System.out.println(n);
                n = n - 2;
                continue;
            }

            break;

        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("정수를 입력하세요.: ");

        int x = stdIn.nextInt();

        recur(x);
    }


}
