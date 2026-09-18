public class java_Q9 {
    public static void main(String[] args) {

        int[][] num = new int[3][5];

        int rowStart = 1;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = rowStart * (j + 1);
                System.out.print( num[i][j] + " " );
            }
            System.out.println();
            rowStart *= 10;

        }

    }
}