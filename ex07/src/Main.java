import java.util.ArrayList;
import java.util.List;

public class Main {


    // 배열에다가 1, 2, 3, 4, 5
    //         6, 7, 8, 9, 10
    //         11, 12, 13, 14, 15
    //         ->
    //         11, 12, 13, 14, 15
    //         1, 2, 3, 4, 5
    //         6, 7, 8, 9, 10
    // 로 바꾸기


    public static void main(String[] args) {
        // 가변적 배열
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        // 정적 배열
        int arr[] = new int[3];
        // int arr[] = new int[3]; // 처음 할당할떄 중괄호로 지정해줘도 괜찮다
        for (int i = 0; i < 3; i++) {
            System.out.println("arr[i] = " + arr[i]);

            arr[1] = 50;
            arr[2] = 40;
            // 지정해준 후에 배열을 다시 만들고 싶을떈 new 를 써야한다
        }
    }
}