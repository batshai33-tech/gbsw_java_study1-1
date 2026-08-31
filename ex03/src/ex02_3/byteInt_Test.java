package ex02_3;

public class byteInt_Test {
    public static void main(String[] args){
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);

        byte a = 10;
        byte b = 20;
        int c = a + b;
        System.out.println("a + b = " +c);
        // 자동 형 변환

        byte d = 10 + 20;
        System.out.println("d = " + d);
        // 이것도 자동 형변환이 가능하다 int -> byte 이지만 (왜는 모른다 나중에 찾아봐야겠다)
    }
}