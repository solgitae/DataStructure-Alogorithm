package da01;

//3개의 정숫값 가운데 최솟값을 구하여 출력합니다.


public class Min3 {
    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
    }

    static int min(int a, int b, int c){
        int min = a;
        if(b < min) min = b;
        if(c < min) min = c;
        return min;
    }
}
