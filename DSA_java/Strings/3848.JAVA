import java.util.*;

class Solution {
    public boolean isDigitorialPermutation(int n) {

        char[] digits = String.valueOf(n).toCharArray();
        Arrays.sort(digits);

        do {
            if(digits[0] != '0') {
                int num = Integer.parseInt(new String(digits));
                if(isDigitorial(num)) return true;
            }
        }
        while(nextPermutation(digits));

        return false;
    }

    private boolean isDigitorial(int n){
        int sum = 0;
        int temp = n;

        while(temp > 0){
            int d = temp % 10;
            sum += fact(d);
            temp /= 10;
        }

        return sum == n;
    }

    private int fact(int n){
        int f = 1;
        for(int i=1;i<=n;i++) f *= i;
        return f;
    }

    private boolean nextPermutation(char[] arr){
        int i = arr.length - 2;

        while(i >= 0 && arr[i] >= arr[i+1]) i--;

        if(i < 0) return false;

        int j = arr.length - 1;
        while(arr[j] <= arr[i]) j--;

        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        reverse(arr, i+1);

        return true;
    }

    private void reverse(char[] arr, int start){
        int end = arr.length - 1;

        while(start < end){
            char t = arr[start];
            arr[start] = arr[end];
            arr[end] = t;
            start++;
            end--;
        }
    }
}