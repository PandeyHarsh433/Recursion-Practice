public class binarySearch {

    public static int findEL(int arr[], int high, int low, int data) {
        
        int mid = low + (high - low) / 2;

        if (low > high)
            return -1;

        if (arr[mid] == data) {
            return mid;
        }

        if (arr[mid] > data) {
            return findEL(arr, mid - 1, low, data);
        } else if (arr[mid] < data) {
            return findEL(arr, high, mid + 1, data);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 67 };
        System.out.println(findEL(arr, 7, 0, 67));
    }
}
