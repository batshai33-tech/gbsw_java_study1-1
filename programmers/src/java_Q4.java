class java_Q4 {
    public int solution(int slice, int n) {
        if (n % slice == 0){
            return n / slice;
        }else{
            return n / slice + 1;
        }
    }
    public static void main(String[] args) {
        java_Q4 q4 = new java_Q4();
        int result = q4.solution(7, 123123123);
        System.out.println(result);
    }
}


