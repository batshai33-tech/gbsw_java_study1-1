public class Main_CC {
    public void doA (int[] arr){
        int Max = 0;
        int Min = arr[1];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Max < arr[i]) {
                Max = arr[i];
            }
            if (arr[i] > 5){
                count++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (Min > arr[i]) {
                Min = arr[i];
            }
        }
        System.out.println("Max = " + Max);
        System.out.println("Min = " + Min);
        System.out.println("count = " + count);

    }
}
