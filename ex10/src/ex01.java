public class ex01 {
    String name;
    int age;
    int score;

    // 커멘트 + n -> toString() -> 더욱 쉬운 객채지향 출력


    // 생성자 오버로딩... (여러개의 생성자)
    // 다른생성자 호출 : this ()

    // 기본생성자 출력 / 생성자 선언 [커맨드 + n 생성자 (this)]
    public ex01() {
        this.name = "홍길동";
        this.age = 20;
    }


    // 다른생성자..
    public ex01 (String name , int age , int score) {
        this.name = name;
        this.age = age;
        this.score = score;
        System.out.println("기본생성자가아닌 다른생성자");
    }

    @Override
    public String toString() {
        return "ex01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
