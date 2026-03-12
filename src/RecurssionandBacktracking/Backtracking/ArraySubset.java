package RecurssionandBacktracking.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class ArraySubset {
    static void ArraySubsets(int[] arr, int index, List<Integer> current) {
        //base case
        if(index==arr.length){
            System.out.println(current);
            return;
        }
        //Add the element
        current.add(arr[index]);
        ArraySubsets(arr,index+1,current);

        //Backtracking
        current.remove(current.size()-1);

        //skip and explore
        ArraySubsets(arr,index+1,current);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArraySubsets(arr, 0, new ArrayList<>());
    }
}