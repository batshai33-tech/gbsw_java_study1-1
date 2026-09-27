public class Ex03 {
    public static void main(String[] args) {
        Singleton s1 = new Singleton();
        Singleton s2 = new Singleton();

        // 각자 따로 클래스 객체생성 -> 메모리낭비
        // 하나의 클래스를 여러명이 가리키는법 (Singleton.java)

        System.out.println(s1);
        System.out.println(s2);

        Singleton s3 = Singleton.getInstance();
        Singleton s4 = Singleton.getInstance();
        // 출력해보면 같은 주소 값이 나온다
        System.out.println(s3);
        System.out.println(s4);



    }
}
