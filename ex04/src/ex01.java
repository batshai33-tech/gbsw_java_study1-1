import java.util.Scanner;

public class ex01 {
    public static void main(String[] args){



        System.out.println("숫자를 입력하새요");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // 파이썬에 input() 과 같은 개념이다 (왜캐 어려워)
        System.out.println("a = " +a);

        // 숫자를 문자열로 바꾸는거

        // String b = a;  <- 이대로 쓰면 오류가 난다 강재형변환도 String 만 안됨
        // String b = a + ""; <-  a 에다가 문자열을 더함 (가능)
        String b = String.valueOf(a); // 보통은 스트링 벨류 Of 를 쓴다 (아니 그게 뭔데!!) 그냥 그런게 있다
        System.out.println("문자열 덧샘 " +b+5);

        // 문자열을 숫자열로 바꾸는거

        int c = Integer.parseInt(b)+5; // 문자열을 숫자로 바꿀려면 인티저 퍼서int 를 적어줘야한다 (아아악!!) 그냥 그런게 있다고;;
        System.out.println("c = "+c);
        // 바꾸는건 이거 두개만 기억해주면 좋다

        // 예외처리 맛보기

        // System.out.println(Integer.parseInt("1a"));
        // 실행을 하게되면 넘버 포멧 입섹션(예외가 발생했다) 오류가 발생한다
        // 그래서 예외처리 맛보기만 해보자

        try {
            System.out.println(Integer.parseInt("1a"));
            System.out.println("실행");
        }catch (Exception e){
            System.out.println(e);
            System.out.println("예외실행");
        }
        // js 랑 똑같이 try catch 를 쓴다

    }
}

