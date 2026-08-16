import java.io.*;
import java.util.*;

public class Main {

    static int[] p01, p10;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());

            String s = br.readLine().trim();
            String t = br.readLine().trim();

            p01 = new int[n + 1];
            p10 = new int[n + 1];

            for (int i = 1; i <= n; i++) {

                p01[i] = p01[i - 1];
                p10[i] = p10[i - 1];

                if (s.charAt(i - 1) == '0' && t.charAt(i - 1) == '1')
                    p01[i]++;

                if (s.charAt(i - 1) == '1' && t.charAt(i - 1) == '0')
                    p10[i]++;
            }

            while (q-- > 0) {

                st = new StringTokenizer(br.readLine());

                int l = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());

                int len = r - l + 1;

                int cnt01 = p01[r] - p01[l - 1];
                int cnt10 = p10[r] - p10[l - 1];

                int same = len - cnt01 - cnt10;

                if (Math.abs(cnt01 - cnt10) <= same)
                    out.append("YES\n");
                else
                    out.append("NO\n");
            }
        }

        System.out.print(out);
    }
}
