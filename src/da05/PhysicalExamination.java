package da05;


import java.util.Scanner;

public class PhysicalExamination {

    static final int VMAX = 21;

    static class PhyscData {
        String name; //이름
        int height; //키
        double vision; //시력

        PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    static double aveHeight(PhyscData[] dat){
        double sum = 0;

        for (int i = 0; i < dat.length; i++) {
            sum += dat[i].height;

        }
        return sum / dat.length;
    }

    static void distVision(PhyscData[] dat, int[] dist){ //시력 분포를 배열로 만듦
        int i = 0;

        dist[i] = 0;

        for (i = 0; i < dat.length; i++) {
            if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0){ //VMAX 21개의 층을 만들고 시력에
                dist[(int)(dat[i].vision * 10)]++; //특정 층에 해당하는 학생들을 채워 넣는 것 ex) 0.3은 인덱스 3에 해당하는데 시력이0.3이면 [3]가 ++돼서 하나씩 늘어남 이렇게 배열을 채움
            }
        }
    }


    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("박현규", 162, 0.3),
                new PhyscData("함진아", 173, 0.7),
                new PhyscData("최윤미", 175, 2.0),
                new PhyscData("홍연의", 171, 1.5),
                new PhyscData("이수진", 168, 0.4),
                new PhyscData("김영준", 174, 1.2),
                new PhyscData("박용규", 169, 0.8)
        };

        int[] vdist = new int[VMAX]; //0.0 ~ 2.0까지 0.1씩 21번
        System.out.println("* 신체검사 리스트 *");
        System.out.println("이름     키   시력");
        System.out.println("---------------");
        for (int i = 0; i < x.length; i++) {
            System.out.printf("%-8s%3d%5.1f\n",
                    x[i].name, x[i].height, x[i].vision);
        }
        System.out.printf("\n평균 키: %5.1fcm\n", aveHeight(x));

        distVision(x, vdist); //학생들 데이터(x)를 가지고 vdist배열을 채움
        System.out.println("\n시력 분포");
        for (int i = 0; i < VMAX; i++) {
            System.out.printf("%3.1f~ : %2d명\n", i / 10.0, vdist[i]);
        }
    }


}
