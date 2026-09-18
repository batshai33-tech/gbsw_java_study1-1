import calcu.Calculate;
import java.util.Scanner;

//다른패키지에 있으면 import 구문 작성

public class Ex01 {
    public static void main(String[] args) {

        Calculate c = new Calculate();
        // 타입변수 이름 = 새로상속한다 상속할꺼()


        //문제 : 두수를 입력받아 add 함수를 2개를 구현하는데
        // 1. add1 는 리턴값이 없도록 (void)
        // 2. add2 는 리턴값이 있도록 (String)
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 1, 2 입력");
        int num1 = Integer.parseInt(sc.next());
        int num2 = Integer.parseInt(sc.next());

        c.add1(num1, num2);

        System.out.println("Ex1 = " + num1);
        System.out.println("Ex2 = " + num2);
        // System.out.println(c.add1(num1, num2));
//          void 타입은 print 처럼 출력이 불가
//          기본적으로 메서드에서 출력해줘야함

//        String n = c.add2(num1, num2);
//        System.out.println(n);
        //public : 다른패키지 참조가능
        //default : 같은패키지 참조가능
        //protect : 상속된 패키지 참조가능
        //private : 자신의 패키지만 참조가능
    }
}
