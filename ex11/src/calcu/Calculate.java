package calcu;
public class Calculate {

    public void add1(int a, int b) {
        System.out.println("저희 더해요");
        System.out.println(a + b);
        a = 20;
        b = 30;

        System.out.println("add1 = " + a);
        System.out.println("add2 = " + b);


        // return 생략가능
        // 기본생성자도 생략가능
    }

    public String add2(int c, int d) {
        return c + d + "";
    }



}
