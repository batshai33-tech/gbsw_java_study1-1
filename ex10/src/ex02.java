import java.util.Arrays;
import java.util.Scanner;


public class ex02 {
    public static void main(String[] args) {

        // 학생 다섯명을 배열선언
        // 점수를 100 90 80 70 60 입력받아서
        // 성적평균을 만들고
        // 70 점 이상인 사람이 몇명인지 구해라

        ex01 srr[] = new ex01[5];

        for (int i = 0; i < 5; i++) {
            srr[i] = new ex01();
        }

        // System.out.println(Arrays.toString(srr));
        int total = 0;
        int high_70 = 0;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1 + "번째 " + "성적입력");
            int score = Integer.parseInt(sc.nextLine());
            //입력
            srr[i].score = score;
            // i 번째 점수 정의
            total = total + score;
            // 점수의 총합 (나중에 평균을 위해)
            if (score >= 70) {
                high_70 ++;
                // 만약 그 점수가 70 이상이라면 high 에 +1
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(srr[i]);
        }
        double p = (double) total / srr.length;
        // 총합을 소수(더블) 로 만들어준다음 평균 구하기(srr배열의 길이로 나누기)

        System.out.println("평균 = " + p);
        System.out.println("70 이상 = " + high_70 + "명");
    }
}
