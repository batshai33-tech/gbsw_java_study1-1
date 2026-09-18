import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열크기 입력하새요");
        int num = Integer.parseInt(sc.nextLine());

        int[] arr = new int[num];
        System.out.println("arr.length = " + arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + "번째 점수를 입력하세요");
            Scanner x = new Scanner(System.in);
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "점");
            System.out.println();
        }



    }


}