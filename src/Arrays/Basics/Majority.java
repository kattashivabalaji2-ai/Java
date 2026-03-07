package Arrays.Basics;

public class Majority {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 2, 3, 2, 2};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count>arr.length/2) {
                System.out.println("Majority element:" + arr[i]);
                return;
            }
        }

    }

}
