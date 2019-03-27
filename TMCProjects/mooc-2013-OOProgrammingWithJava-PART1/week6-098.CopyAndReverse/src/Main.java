import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] copied = reverseCopy(original);

        // change the copied

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("copied: " + Arrays.toString(copied));
    }

    public static int[] copy(int[] original) {
        int[] temp = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            temp[i] = original[i];
        }
        return temp;
    }

    public static int[] reverseCopy(int[] original) {
        int[] temp = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            temp[i] = original[original.length-1-i];
        }
        return temp;
    }
}
