// 학생점수 5개 입력 받기
// 점수평균과 총합 풀기

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하라 애송이 : ");
        int count = sc.nextInt();
        int [] number = new int[count];
        int sum = 0; // 1차원 배열 5 를 만들겠다

        System.out.print(count + "개의 숫자를 입력하라 애송이 : ");

        for (int i = 0; i < count; i++) {
            number [i] = sc.nextInt();
            sum += number [i]; // 총합
        }
        double avd = sum * 1.0 / number.length;
        System.out.println("총합" + sum);
        System.out.println("평균" + avd);

    }



}
