package Arrays.Basics;
//It is a voting system algorithm
//reducing the time complexit to O(n)
public class MajorityUsingBoyreMoore {
    public static void main(String[] args) {
        int[] arr={2,2,1,3,3,2,2,3,2};
        int candidate=arr[0];
        int count=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==candidate){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                candidate=arr[i];
                count=1;
            }
        }
        System.out.println("Majority element:"+candidate);
    }
}
