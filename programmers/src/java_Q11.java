public class java_Q11 {
        public int[] solution(int[] arr, int[][] intervals) {
            // 1. 필요한 변수들을 미리 꺼내두기 (보기 편하게)
            int a1 = intervals[0][0];
            int b1 = intervals[0][1];
            int a2 = intervals[1][0];
            int b2 = intervals[1][1];

            // 2. 정답 배열의 총 크기 구하기
            int size1 = b1 - a1 + 1; // 첫 번째 구간의 개수
            int size2 = b2 - a2 + 1; // 두 번째 구간의 개수
            int[] answer = new int[size1 + size2]; // 합친 크기만큼 방 만들기

            // 3. 정답 배열에 값을 하나씩 채워넣기 위한 '방 번호(인덱스)' 변수
            int index = 0;

            // 4. 첫 번째 구간 (a1부터 b1까지) 정답에 넣기
            for (int i = a1; i <= b1; i++) {
                answer[index] = arr[i];
                index = index + 1; // 다음 칸으로 이동
            }

            // 5. 두 번째 구간 (a2부터 b2까지) 정답에 이어서 넣기
            for (int i = a2; i <= b2; i++) {
                answer[index] = arr[i];
                index = index + 1; // 다음 칸으로 이동
            }

            return answer;
        }
    }

