import java.util.Scanner;

public class java_Q8 {
    /*
     학생수 입력
     학생수 만큼 점ㅅ를 입력받아 총점 평균을 구하시오
     */

    public static void main(String[] args) {
        Scanner classNum = new Scanner(System.in); // 입력
        System.out.println("학생수 입력");
        int num = Integer.parseInt(classNum.nextLine()); // num 을 스캐너로 입력받은 학생수로 객채지정
        System.out.println("classNum = " + num);

        int [] scores = new int[num];
        int total = 0;
        for (int i = 0; i < num; i++) {
            System.out.println( (i + 1)  + " 번째 학생 점수 입력 : ");
            scores[i] = Integer.parseInt(classNum.nextLine());
            total += scores[i];
        }

//        for (int i : scores) System.out.println(scores[i]); // 좀더 간단한 for 문

        System.out.println("총점 "+ total);
        System.out.println("평균 "+ (double) total / num);
        }
    }
