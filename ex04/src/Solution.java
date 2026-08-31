import java.util.Arrays;
import java.util.Scanner;

//빠른에러처리( 옵션 + 엔터)
public class Solution {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String a = sc.next();
        String a ="a b c d e";
        String b[] = a.split(" ");
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
        System.out.println(b[4]);

        // String[] b = a.split("[^a-zA-Z0-9가-힣_]+")
        //System.out.println("b[0] = " + b[0]);
        //System.out.println("a = " + Arrays.toString(b));

        // System.out.println("a = " + a);
        // for (int i = 0; i < a.length(); i++){
            // System.out.println(a.charAt(i));
            //charAt => string 구문에서 특정 문자() 를 가져오는 매서드
        }
    }
// }
