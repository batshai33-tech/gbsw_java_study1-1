public class Ex02 {
    // num1 , num2
    // plus()  min()
    //staUum1, staNum2
    //staPlus() , staMin()

    // 스태틱 메서드로 덧셈, 뺄셈 만들기,

    // 인스턴트 메서드로 덧셈,뺄샘 만들기

    // static 출력
    public static void main(String[] args) {
        // static 맴버 출력
        System.out.println(Calculator.staNum1);
        System.out.println(Calculator.staNum2);

        // 인스턴트 맴버 출력
        Calculator c2 = new Calculator();
        System.out.println(c2.num1);
        System.out.println(c2.num2);

        // static 메서드 출력
        Calculator.staPlus();
        Calculator.staMin();


        // 인스턴트 메서드 출력
        c2.plus(10);
        c2.min(1);
        // 인스턴트메서드를 이용해 값을 바꾸고 나서 다시출력
        System.out.println(c2.num1);
        System.out.println(c2.num2);


    }

}
