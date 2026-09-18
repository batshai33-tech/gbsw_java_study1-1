import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex03 {

    public static void main(String[] args) {
        GG gg = new GG();

        int num = 10;

        gg.doA(num);

        int[] arr = {10, 20, 30};
        gg.doC(arr);
        System.out.println("Main arr = ");
        System.out.println(Arrays.toString(arr));
//        System.out.println("main gg.arr = " + arr.arr);
    }
}
