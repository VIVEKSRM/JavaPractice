package javaPracticle;

public class findPairWithGivenSum {
    public static void main(String[] args) {

        int[] arr = {1, 4, 6, 8, 10};
        int target = 14;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j]);
                }
            }
        }

    }
}
