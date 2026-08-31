public class java_Q1 {
    public int solution(int a, int b) {   // 숫자형으로 a 와 b 를 받아준다
        int result1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        // result 1 을 정의해준다 a 와 b 를 문자로 더해준다음 다시 숫자로 바꿔준다
        int result2 = (2 * a * b);
        // 2 곱하기 a 곱하기 b
        if (result1 > result2){   //  비교해준다
            return result1;  // result1 가 더크면
        }else{
            return result2;  // result2 가 더크면
        }
    }
    public static void main(String[] args) {

        // 일반적인 Java 프로그램의 실행 시작점

        java_Q1 q1 = new java_Q1();

        // java_Q1 클래스를 이용해서 객체를 만들고
        // q1이라는 변수로 그 객체를 참조한다.

        int result = q1.solution(10, 20);

        // q1 객체의 solution() 메서드를 호출하고
        // 10과 20을 매개변수로 전달한다.
        // 반환된 값을 result에 저장한다.

        System.out.println(result);

        // 결과를 출력한다.
    }}
