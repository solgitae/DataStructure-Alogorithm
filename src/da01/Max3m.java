package da01;

//3개의 정숫값 가운데 최댓값을 구하여 출력합니다.

public class Max3m {
   static int max3(int a, int b, int c) {
        int max = a;

        if (b > max)
            max = b;
        if (c > max)
            max = c;
        return max;
    }

    public static void main(String[] args) {
        System.out.println(max3(1, 2, 3));
    }
}


