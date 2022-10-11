import java.util.ArrayList;

public class searchingWithRec {

    static int linearSearch(int[] arr, int n, int i) {
        if (arr[i] == n) {
            return i;
        }
        if (i == arr.length - 1) {
            return -1;
        }
        return linearSearch(arr, n, i + 1);
    }

    static int binarySearch(int[] arr, int n, int low, int high) {

        int mid = low + (high - low) / 2;

        if (arr[mid] == n) {
            return mid;
        }
        if (arr[mid] < n) {
            binarySearch(arr, n, mid + 1, high);
        } else {
            binarySearch(arr, n, low, mid - 1);
        }
        return -1;

    }

    static ArrayList<Integer> findAllOccurences(int[] arr, int n, int i, ArrayList<Integer> list) {

        if (i == arr.length) {
            return list;
        }
        if (arr[i] == n) {
            list.add(i);
        }
        return findAllOccurences(arr, n, i + 1, list);
    }

    static int rotatedBinary(int[] arr, int n, int low, int high) {

        int mid = low + (high - low) / 2;

        if (arr[low] <= arr[high]) {

            if (arr[mid] == n) {
                return mid;
            }

            if (n >= arr[low] && n <= arr[mid]) {
                rotatedBinary(arr, n, low, mid - 1);
            } else {
                rotatedBinary(arr, n, mid + 1, high);
            }
            return -1;
        } else {

            if (arr[mid] == n) {
                return mid;
            }

            if (n >= arr[mid] && n <= arr[high]) {
                rotatedBinary(arr, n, mid + 1, high);
            } else {
                rotatedBinary(arr, n, low, mid - 1);
            }
            return -1;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 31, 4, 3, 4, 6, 7, 4 };
        ArrayList<Integer> list = new ArrayList<>();
        findAllOccurences(arr, 4, 0, list);
        System.out.println(list);
    }
}
