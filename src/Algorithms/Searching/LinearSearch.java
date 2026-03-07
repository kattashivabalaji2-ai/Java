package Algorithms.Searching;

public class LinearSearch {
    static int Linear(int key, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, 7, 1, 18, 20, 11, 36};
        int result = Linear(11, arr);
        if (result != -1) {
            System.out.println("The Key is found in index:" + result);
        } else
            System.out.println("Key not found");
    }
}

