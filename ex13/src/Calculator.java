public class Calculator {
    // 인스턴트 멤버
    int num1;
    int num2;

    // 인스턴트 메서드
    void plus(int num1) {
        this.num1 = num1;
    }
    void min(int num2) {
        this.num2 = num2;
    }

    // static 맴버
    static int staNum1 = 10;
    static int staNum2 = 20;

    // static 메서드
    static void staPlus(){
        System.out.println("플러스프린트입니다");
    }
    static void staMin(){
        System.out.println("마이너스프린트입니다");
    }

}
