package da09;

import java.util.Scanner;

//하노이의 탑

public class Hanoi {

    static void move(int no, int x, int y) {
        if(no > 1){
            move(no - 1, x, 6 - x - y); //위에 걸 중간 기둥으로 먼저 옮겨 놓고, 밑에 있는 걸 옮기는 로직.. 1보다 크면 계속 재귀
        }
        System.out.println("원반[" + no + "]을 " + x + "기둥에서 " + y + "기둥으로 옮김");

        if(no > 1){
            move(no - 1, 6 - x - y, y);
        }

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("하노이의 탑");
        System.out.print("원반 개수: ");
        int x = stdIn.nextInt();

        move(x, 1, 3);
    }
}
