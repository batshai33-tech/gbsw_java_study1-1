class Solution {
    public int solution(int a, int b) {
        int result1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int result2 = (2 * a * b);
        if (result1 > result2) {
            return result1;
        } else {
            return result2;
        }
    }
}

class Solution1 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }
        return answer;
    }
}