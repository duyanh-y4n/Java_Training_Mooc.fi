import java.util.Arrays;

public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int beginning = 0;
        int end = array.length - 1;
        if (end==0) return searchedValue==array[0];
        while (beginning <= end) {
            int middle = (beginning + end) / 2;
            if(middle==beginning) return searchedValue==array[middle]||searchedValue==array[end];
            if (array[middle] == searchedValue) {
                return true;
            } else if (array[middle]<searchedValue) {
                beginning = middle;
            } else if (array[middle]>searchedValue) {
                end = middle;
            }

            // restrict the search area 
        }
        return false;
    }
}
