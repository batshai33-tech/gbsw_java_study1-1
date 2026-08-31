public class ex02 {
    public static void main(String[] args) {
        int [][] arr = new int[5][5];
        // 5 * 5 배열 생성

        for (int i = 0; i < 5; i++) { // i 로 for문
            int value = 5 - i;
            int plus = 5 - i;
            // 5,4,3,2,1 순서대로 배열에 넣기위해
            // i 가 증가할때마다 value 와 plus 가 1씩 줄어들도록 객채생성

            for (int j = 0; j < 5; j++) { // j 로 2중 반복문
                arr[i][j] = value; // 그때마다 (i , j) 쪽에 value 를 넣음
                value = value + plus; // 넣고나서 value 에다 plus 를 더함
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }


        int [][] brr = new int[5][5];
        // 5 * 5 배열 생성
        int value = 5 ;
        int plus = 5 ;

        for (int i = 0; i < 5; i++, plus--) { // i 로 for문
            // 5,4,3,2,1 순서대로 배열에 넣기위해
            // i 가 증가할때마다 value 와 plus 가 1씩 줄어들도록 객채생성

            for (int j = 0; j < 5; j++) { // j 로 2중 반복문
                brr[i][j] = value; // 그때마다 (i , j) 쪽에 value 를 넣음
                value = value + plus; // 넣고나서 value 에다 plus 를 더함
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }



    }

}

