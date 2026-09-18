import java.util.Arrays;

public class GG {


    // 기본값 복사 매서드 (int, double....)
    public void doA(int num) {
        System.out.println("Main num = " + num);
        num = 100;
        System.out.println("Do A num = " + num);
    }

    // 참조값 복사 메서드 (배열, 객체, 컬렉션...)

    ;

    public void doC(int[] arr) {
        arr[0] = 1000;
        arr[1] = 2000;
        arr[2] = 3000;
        System.out.println("GG doC arr");
        System.out.println(Arrays.toString(arr));

//    public void doB(int[] arr){
//        int[] err = {10, 20, 30};
//        System.out.println();
//    }


    }
}
