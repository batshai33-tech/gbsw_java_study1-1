import java.util.Scanner;

public class Ex05 {
    // DoA 메서드 생성
    // DoA 메서드는 배열을 받아서
    // 초대값과 최소값을 구하고
    // 배열에서 5이상인 개수를 카운트로 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Ar = sc.nextInt();
        int[] arr = new int[Ar];

        int inNum = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inNum;
        }

        Main_CC cc = new Main_CC();
        cc.doA(arr);

    }
}
