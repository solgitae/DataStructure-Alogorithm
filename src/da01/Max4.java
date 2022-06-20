package da01;

//4개의 정숫값 가운데 최댓값을 구하여 출력합니다.

public class Max4 {
    public static void main(String[] args) {
        System.out.println(max4(1, 2, 3, 4));
    }

    static int max4(int a, int b, int c, int d){
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        if(d > max) max = d;
        return max;
    }
}
