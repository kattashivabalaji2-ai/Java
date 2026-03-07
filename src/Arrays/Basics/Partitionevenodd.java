//package Arrays.Basics;
//
//public class Partitionevenodd {
//    public static void main(String[] args) {
//        int[] arr = {5, 2, 8, 7, 1, 6};
//        int Left = 0;
//        int Right = arr.length - 1;
//        while (Left < Right) {
//            while (arr[Left] % 2 == 0 && Left < Right) {
//                Left++;
//            }
//            while (arr[Right] % 2 != 0 && Left < Right) {
//                Right--;
//            }
//        }
//        if (Left < Right) {
//            int temp = arr[Left];
//            arr[Left] = arr[Right];
//            arr[Right] = temp;
//            Left++;
//            Right--;
//        }
//    }
//    for(int i=0;i< arr.length;i++){
//
//    }
//}
