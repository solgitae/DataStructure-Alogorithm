package da01;

public class min4 {
    public static void main(String[] args) {
        System.out.println(min4(1, 2, 3, 4));
    }

    static int min4(int a, int b, int c, int d) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;
        return min;
    }
}
