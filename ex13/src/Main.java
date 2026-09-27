public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.speed);
        System.out.println(c1.model);

        System.out.println(Car.aa);
        System.out.println(c1.speed);
        // static 메서드 활용
        Car.run();
        // 인스턴트 메서드는 객체 를 생성해서 힙영역애 할당해야 사용할수있다
//       Car.speed(100); (X)
        c1.setSpeed(100);
        System.out.println(c1.speed);

    }
}