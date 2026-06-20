import java.util.ArrayList;
public class arraysubset {

    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 4, 9};

        ArrayList<Integer> curr = new ArrayList<>();
        fun(arr, 0, curr);
    }

    public static void fun(int[] arr, int idx, ArrayList<Integer> curr) {

        if (idx == arr.length) {
            System.out.println(curr);
            return;
        }

        // Not Take
        fun(arr, idx + 1, curr);

        // Take
        curr.add(arr[idx]);
        fun(arr, idx + 1, curr);

        curr.remove(curr.size() - 1); // backtrack
    }
}