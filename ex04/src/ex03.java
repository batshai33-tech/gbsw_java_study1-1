public class ex03 {
    static void main() {
        int a = 10; // 1010
        int b = 11; // 1011
        System.out.println(a & b); // (1010 + 1011 = 1010)2진수 => (10) 10진수 [bit 계산]

        String temp = a>b ? "a가 크다" : "b가 크다";
        // 만약 a 가 b 보다 크다면 a 가 크다를 temp 에 넣어라 아니면 b가 크다 를 temp 에 넣어라
        System.out.println(temp);

    }
}
