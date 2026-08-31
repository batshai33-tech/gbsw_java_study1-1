package ex02_3;

public class CastingTest {
    static void main() {
        byte a = 10;
        int b = a; // 자동 형 변환 (큰거에서 작은거)
        // 그냥 선언해도 괜찮음

        int c = 20;
        byte d = (byte) c; // 강제 형 변환 (작은거에서 큰거)
        // (바꿀 형) 을 바꿀꺼 뒤에다 안넣어주면 바꿀수 없음 [경고표시]
        // 강제 형 변환은 비트의 수가 맞지 않는걸 바꾸려고 할때 문제가 될수있다

        int a1 = 129;
        byte a2 = (byte) a1;
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("a2 = " + a2);
        // a1 을 129로 넣고 a2 에다 형변환을 했지만 129가 아닌 -127이 나오는걸 볼수있다

        // 빠른에러처리 (option + enter) 로 바로 (바꿀형) 을 넣을수 있긴하다

        // 해보기
        double d1 = 3.14;
        int e = (int) d1;
        System.out.println("d1 = " + d1);
        System.out.println("e = " + e);
        // 이것도 e는 실수가 아닌 소수이기때문에 d1을 넣었지만 3.14 가 0.14가 빠진 3 만 출력하는걸 볼수있다
        // 바꿀때 너무 크다싶으면 일부 비트를 버린다...

        // 문자열 -> 숫자
        String temp = "100";
        int f = Integer.parseInt(temp);
        System.out.println(f);

        // 숫자 -> 문자열
        String kk = a + "";
        String kkk = String.valueOf(a);
        System.out.println(kk);
        System.out.println(kkk);

    }
}

