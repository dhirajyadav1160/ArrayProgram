import java.util.Arrays;
import java.util.*;

public class Deefuck {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[] = { 1, 4, 15 };
        int b[] = { 6, 7, 8, 9 };
        int c[] = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }
        Arrays.sort(c);
        for (int i = 0; i < c.length; i++) {
            int temp = c[i];
            c[i] = c[c.length - 1 - i];
            c[c.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(c));
    }
}
