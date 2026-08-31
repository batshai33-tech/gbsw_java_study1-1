public class ex02 {

    public static void main() {
        int var1 = 10;
        int var2 = var1 + 10;
        if (var1 > 0) {
            System.out.println("var2 = " + var2);
        }
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);

        // 메인함수 영역 안에서 var 1이 있고 var 2 는 if 문 안에 존재하게 된다
        // 그래서 메인함수영역에서 var1 을 호출해도 괜찮치만
        // var2 는 메인함수에서가 아니 if 문 안에서만 쓸수있기에 호출시키면 오류가 난다
        // 정확히는 var2는 if문이 끝나고나서 사라지기때문에 호출시킬수 없당
        // 당연하게도 var2를 메인범위에 써주면 쓸수있다 (2번 쓸수 없다는걸 알자)
    }
}
