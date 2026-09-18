import java.util.Scanner;

public class ex03 {
    //product 클래스 생성
    //필드 name(이름) , price(돈) , desc(설명)

    //product 배열 5개 생성
    // 0 = ["띠부씰",2000,"집사Tv 에서 팜"]
    // 0 = ["ㅁㄴㅇ",2003,"집사 에서 팜"]
    // 0 = ["ㅇㄴㅁ",2004,"사Tv 에서 팜"]
    // 0 = ["ㄴㅁㅇㄴㅇ",2002,"집Tv 에서 팜"]
    // 0 = ["ㅋㅌ",2001,"Tv 에서 안팜"]

    // 배열의 내용을 출력
    // 상품의 평균값을 출력
    // 상품의 평균값 이상이 개수를 출력

    public static void main(String[] args) {

        product prr[] = new product[5];

        prr[0] = new product("띠부씰" , 2000 , "띠부씰입니다");
        prr[1] = new product("AAA" , 10000 , "A");
        prr[2] = new product("BBB" , 5000 , "B");
        prr[3] = new product("CCC" , 3000 , "C");
        prr[4] = new product("DDD" , 1000 , "D");
        // 배열 프로덕트 넣어주기

        int total = 0; // 총값
        int count = 0; // 평균이상 값 개수

        for (int i = 0; i < 5; i++) {
            total = total + prr[i].price;
            // 반복문으로 프로덕트의 총 값 구하기
        }
        double p = (double) total / prr.length;
        // 그 총값의 평균 구하기
        for (int i = 0; i < 5; i++) {
            if (prr[i].price >= p) {
                count++;
                // 만약 평균값보다 i 번째 프로덕트가 더 큰 가격이면
                // 카운트를 1 증가
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(prr[i]);
            // 배열의 내용출력
        }

        System.out.println(p);
        // 상품의 평균값 출력
        System.out.println(count);
        // 평균값보다 큰 값 출력

    }






}
