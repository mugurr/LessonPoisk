import java.sql.Array;

public class Main {
    public static int binarySearch(int arr[], int elementToSearch) {
        return binarySearch(arr, 0, arr.length-1, elementToSearch);
    }
    public static int binarySearch(int[] arr, int firstIndex, int lastIndex, int elementToSearch) {
        int middle = (firstIndex + lastIndex) / 2;
        if(lastIndex < firstIndex) {
            return -1;
        }

        if(elementToSearch==arr[middle]) {
            return middle;
        } else if(elementToSearch<arr[middle]) {
            return binarySearch(arr, firstIndex, middle - 1, elementToSearch);
        } else {
            return binarySearch(arr, middle + 1, lastIndex, elementToSearch);
        }
    }
    public static void main(String[] args) {
        System.out.println("Hallo wolrd!");
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(binarySearch(myArray, 0, myArray.length, 8));
    }
}