package da10;

import java.util.Scanner;

public class BubbleSort {

    static void swap(int[] a, int idx1, int idx2) { //idx1은 앞의 값, idx2는 뒤의 값
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSortV1(int[] a, int n) { //n은 요솟수
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if(a[j - 1] > a[j]){
                    swap(a, j - 1, j);
                }
            }
        }
    }

    static void bubbleSortV2(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int exchg = 0;
            for (int j = n - 1; j > i ; j--) {
                if(a[j - 1] > a[j]){
                    swap(a, j - 1, j);
                    exchg++;
                }

                if(exchg == 0)break;
            }

        }
    }

    static void bubbleSortV3(int[] a, int n) {
        int k = 0;
        while(k < n - 1) {
            int last = n - 1;
            for (int j = n - 1; j > k; j--) {
                if(a[j - 1] > a[j]){
                    swap(a, j - 1, j);
                    System.out.println(j);
                    last = j;
                }
            }
            k = last;

        }
    }


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("버블 정렬(버전 3)");
        System.out.print("요솟수: ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];


        //배열 입력으로 채우기
        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        bubbleSortV3(x, nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] : " + x[i]);

        }



    }

}
