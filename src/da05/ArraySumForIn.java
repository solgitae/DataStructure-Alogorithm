package da05;

//배열의 모든 요소의 합을 구하여 출력함(확장 for문)

public class ArraySumForIn {
    public static void main(String[] args) {
        double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]= " + a[i]);
        }
        double sum = 0;

        for (double i : a) {  //여기서 i는 인덱스가 아닌 별개의 변수명이다. 즉, i가 아닌 다른 변수가 와도 됨... 해석할 때는 a배열에 있는 모든 요소를 처음부터 끝까지 한 개씩 스캔한다라고 해석하면 됨.
            sum += i;
        }
        System.out.println("모든 요소의 합은 " + sum + "입니다.");
    }
}
