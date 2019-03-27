
public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {-1, 3, 1, 7, 4, 5, 2, 4, 3};
        System.out.println("smallest: " + indexOfTheSmallestStartingFrom(values, 7));
    }

    public static int smallest(int[] array) {
        // write the code here
        int[] temp = array.clone();
        sort(temp);
        return temp[0];
    }

    public static void sort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]>array[j]){
                    swap(array,i,j);
                };
            }
        }
    }

    public static void swap(int[] array, int index1, int index2) {
        int swap = array[index1];
        array[index1] = array[index2];
        array[index2] = swap;
    }

    public static int indexOfTheSmallest(int[] array) {
        // code goes here
        for (int i = 0; i < array.length; i++) {
            if (array[i]==smallest(array)) return i;
        }
        return -1;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        // write the code here
        int[] temp = getSubArray(array, index);
        int smallestInSubArray = smallest(temp);
        for (int i = 0; i < array.length; i++) {
            if (array[i]==smallestInSubArray && i>=index) return i;
        }
        return -1;
    }

    private static int[] getSubArray(int[] array, int index) {
        int[] temp = new int[array.length-index];
        for (int i = index; i < array.length; i++) {
            temp[i-index] = array[i];
        }
        return temp;
    }
}
