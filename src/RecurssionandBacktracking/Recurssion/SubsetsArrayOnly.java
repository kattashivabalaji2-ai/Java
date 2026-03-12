package RecurssionandBacktracking.Recurssion;
public class SubsetsArrayOnly {
    public static void generateSubsets(int[] arr, int index, int[] subset, int subsetSize) {
        if (index == arr.length) {

            System.out.print("{ ");
            for (int i = 0; i < subsetSize; i++) {
                System.out.print(subset[i] + " ");
            }
            System.out.println("}");
            return;
        }

        subset[subsetSize] = arr[index];
        generateSubsets(arr, index + 1, subset, subsetSize + 1);

        generateSubsets(arr, index + 1, subset, subsetSize);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] subset = new int[arr.length];

        System.out.println("All subsets:");
        generateSubsets(arr, 0, subset, 0);
    }
}