public class ex03 {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30};
        int brr[] = {40, 50, 60};
        int crr[] = brr;
        System.out.println(arr == brr);
        System.out.println(brr == crr);


        String a = new String("안녕하걔새야");
        String b = new String("안녕하걔새야");
        String c = a;
        System.out.println(a.equals(b));
        System.out.println(a == c);
        System.out.println(a == b);
        System.out.println(a.equals(c));
    }
}
