public class java_Q7 {

    public int solution(int number, int n, int m) {
        if (number % n == 0 && number % m == 0){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        java_Q7 q6 =  new java_Q7();
        int result = q6.solution(60, 2, 3);
        System.out.println(result);
    }
}


