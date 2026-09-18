public class java_Q12 {
    public static void solution(String[] intStrs, int k, int s, int l) {
        int[] temp = new int[intStrs.length];
        int count = 0;

        for (int i = 0; i < intStrs.length; i++) {
            String subStr = intStrs[i].substring(s, s + l);
            int num = Integer.parseInt(subStr);
            if (num > k) {
                temp[count] = num;
                count++;
            }
        }

            int[] answer = new int[count];

            for (int j = 0; j < count; j++) {
                answer[j] = temp[j];
            }
    }
}
