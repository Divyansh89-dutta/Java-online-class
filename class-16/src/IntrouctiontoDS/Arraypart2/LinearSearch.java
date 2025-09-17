package IntrouctiontoDS.Arraypart2;

public class LinearSearch {
//    Method - 1
//    public static int linearSearch(int arr[], int key) {
//        for (int i = 0; i < arr.length; i++) {
//            if (key == arr[i]) {
//                return i;
//            }
//        }
//        return -1;  // key not found
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {34, 56, 23, 78, 95};
//        int key = 23;
//        System.out.println(linearSearch(arr, key));
//    }
//    Method - 2
    public static int binSearch(int arr[], int key){
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {23, 34, 56, 78, 95};
        int key = 23;
        System.out.println(binSearch(arr, key));
    }
}
