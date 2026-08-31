package ex02_3;

public class AutoCasting {
    public static void main(String[] args){
        int a = 10;
        double b = 25.5;
        System.out.println(a+b); // 두 자료형 타입중 더 작은 타입인 int가 double로 바뀌어 자동형변환이 됨

        // 만약 출력앞에 문자열 string을 넣었다면 string 는 16비트로 가장 크기때문에 모두 string로 바뀐다

        System.out.println("안녕하시오" + a+b);

        // 이런식으로 넣은문자열 + a(그대로) + b(그대로) 출력된다

        int c = (int) (a+b);
        System.out.println(c);

        // a + b 는 더블형이다 만약 c 라는 int 형식으로 바꿀려면
        // 강제형변환으로 (넣을 형) 를 넣어줘야하고 또 35.5 에서 35가 된다
    }
}
