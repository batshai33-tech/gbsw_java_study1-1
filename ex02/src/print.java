import java.util.Scanner;

public class print {
    public static void print(String a , int b){ // 전달값
        System.out.println(a);
    }
    // 메소드

    public static int maxNum(int a , int b){
        return (a + b);
    }
    // 반환값과 전달값 모두써준 메소드

    public static void main(String[] args) {

        print("ㅎㅇ" , 1972);
        print("ㅃㅇ" , 2972); // 메소드 호출
        int num = maxNum(50, 20);
        System.out.println("가장 큰숫자의 수는 " + num + "이다");

    }
}
