import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Gbs {
  
    static void generate(int n, String curr, List<String> result) {
        // Base case: if length is n, add to result
        if (curr.length() == n) {
            result.add(curr);
            return;
        }

        // Always try adding '0'
        generate(n, curr + "0", result);

        // Add '1' only if previous char is not '1'
        if (curr.isEmpty() || curr.charAt(curr.length() - 1) != '1') {
            generate(n, curr + "1", result);
        }
    }


    public static void main(String[] args) {
        // Input length n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // List to store results
        List<String> result = new ArrayList<>();

        // Start recursion with empty string
        generate(n, "", result);

        // Print results
        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

}