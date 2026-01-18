
import java.util.*;
public class sring1 {
    public static void main(String[] var0) {
        long var1 = System.currentTimeMillis();
        String var5 = "java";

        for(int var6 = 0; var6 < 100000; ++var6) {
            var5 = var5 + "programming";
        }

        long var3 = System.currentTimeMillis();
        System.out.println("String time: " + (var3 - var1) + " ms");
        var1 = System.currentTimeMillis();
        StringBuilder var13 = new StringBuilder("hello");

        for(int var7 = 0; var7 < 100000; ++var7) {
            var13.append("ruby");
        }

        var3 = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (var3 - var1) + " ms");
        var1 = System.currentTimeMillis();
        StringBuffer var14 = new StringBuffer("java");

        for(int var8 = 0; var8 < 100000; ++var8) {
            var14.append("ruby");
        }

        var3 = System.currentTimeMillis();
        System.out.println("StringBuffer time: " + (var3 - var1) + " ms");
    }
}
