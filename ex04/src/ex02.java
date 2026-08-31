import java.util.Scanner;

        // psvm (public static void main)
        // sout (System.out.println())

public class ex02 {
    public static void main(String[] args) {
        while (true){
            System.out.println("무한루프");
            Scanner sc = new Scanner(System.in);
            String a = sc.nextLine();

            if ( a.equals("exit"))
            {
                break;
            }
            System.out.println("a = "+a);
            // 문자비교는 거의 .equals
        }

    }
}
