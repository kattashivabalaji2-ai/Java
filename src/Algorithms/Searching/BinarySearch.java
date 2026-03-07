package Algorithms.Searching;

public class BinarySearch {
    static int binary(int key,int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if (arr[mid]==key){
                return mid;
            }else if(arr[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int result=binary(6,arr);
        if(result!=-1)
            System.out.println("The key element found at index:"+result);
        else
            System.out.println("Element Not found");
    }
}
