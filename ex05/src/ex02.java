import java.util.Arrays;

public class ex02 {
    public static void main(String[] args) {
        int a = 10;
        int arr[] = {10, 20, 30};
        int b = a;
        int brr[] = arr;

        a = 50;
        arr[0] = 50;
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));
    }
}
