import entity.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 참조 불가능..
        // s1.name (오류)
        // priv (비공개) 라서 다른곳에서 참조불가

        //1차 수행평가 3번째 배열 10개의 크기를 선언
        Car[] cars = new Car[10];


        Scanner sc = new Scanner(System.in);
        int carCount = 0;
        while (true) {
            System.out.println("""
                1. 차등록
                2. 차목록
                3. 등록된차의 평균속도
                4. 등록된차중에 빨간색인 개수
                5. 종료
                """);

            int num = sc.nextInt();
            if (num == 1){// 차등록
                System.out.println("모델입력 : ");
                String model = sc.next();
                System.out.println("색상입력 : ");
                String color = sc.next();
                System.out.println("속도입력 : ");
                int speed = sc.nextInt();

                cars[carCount] = new Car();
                cars[carCount].setModel(model);
                cars[carCount].setColor(color);
                cars[carCount].setSpeed(speed);

                System.out.println("등록완료");

                carCount++;

            } else if (num == 2) {
                System.out.println("차 목록");
                for (int i = 0; i < carCount; i++) {
                    System.out.println(i + 1 + "번째 차");
                    System.out.println(cars[i].toString());

                }
            } else if (num == 3) {
                System.out.println(3);
            } else if (num == 4) {
                System.out.println(4);
            } else if (num == 5) {
                System.out.println(5);
                break;
            }
        }
        // 차등록
        // ->차목록보기
        // ->차 색상 빨간색 개수
        // ->등록된 자동차 평균속도
        // -> 종료

    }
}