public class checkSortusingRec {

    static boolean checkSort(int[] arr, int i) {

        if (arr.length == 0 || arr.length == 1) {
            return true;
        }

        if (i == arr.length - 1) {
            return true;
        }

        return arr[i]<arr[i+1] && checkSort(arr,i+1);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 4, 5, 6 };
        System.out.println(checkSort(arr, 0));
    }
}
