
public class Main {
    public static void main(String[] args) {
        String name1 = "신용권";
        String name2 = "신용권";
        String name3 = new String("전예성");

        System.out.println(name1.equals(name2));
        System.out.println(name1 == name3);
        System.out.println(name2 == name3);
    }
}

// 옵션 + 커맨드 + L == 자동정렬