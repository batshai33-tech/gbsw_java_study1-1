class java_Q6 {
    public int solution(int[] array, int n) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                result++;
            } else {
                continue;
            }
        }
        return result;
    }
}