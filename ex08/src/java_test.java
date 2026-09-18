// 1101 김범규
import java.util.Scanner;

public class java_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("학생수 입력 :");
        int num = Integer.parseInt(sc.nextLine());

        int[] arr = new int [num];
        int all = 0;
        int high = 0;
        int low = 0;
        for (int i = 0; i < arr.length; i++) {
            Scanner input = new Scanner(System.in);
            System.out.print((i + 1) + "번째 학생 점수 입력 : ");
            arr[i] = Integer.parseInt(input.nextLine());
            all += arr[i];

            for (int j = 0; j < arr.length; j++) {


                if (arr[i] > high) {
                    high = arr[i];
                }

                if (arr[i] < low || low == 0) {
                    low = arr[i];
                }
            }
        }

        System.out.println("[점수 목록]");
        double p = (double) all / arr.length;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.println();
        }

        System.out.println("총점 : " + all);
        System.out.println("평균 : " + p);
        System.out.println("최고점 : " + high);
        System.out.println("최저점 :  " + low);

    }


}
