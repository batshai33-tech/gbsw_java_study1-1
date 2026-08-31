import java.util.Scanner;

public class java_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("num = " + num);
        for (int i = 1; i <= num; i++) {                  // 한줄에다 실행
            for (int j = 1; j <= i; j++) {              // 한줄에다 별을 i 만큼 찍음
                System.out.print("* ");              // 별출력
            }
            System.out.println();            // 줄바꿈하고 다음 for 문 실행
        }
        for (int i = num; i >= 1; i--) {             // 한줄에다 실행
            for (int j = 1; j <= i; j++) {            // i 를 1씩 빼 j 를 줄여 줄어드는 별을 찍음
                System.out.print("* ");          // 별출력
            }
            System.out.println();  //            줄바꿈하고 다음 for문 실행
        }
    }
}