import java.util.*;

public class AddArrayElementWithK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array....");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the " + n + " Element of Array...");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of K....");
        int K = sc.nextInt();
        arr = addArrayElementWithK(arr, K);
        System.out.println("Output");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }
    }

    private static int[] addArrayElementWithK(int[] arr, int k) {
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str = str + arr[i];
        }
        int n = Integer.parseInt(str);
        // System.out.println(n);
        n = n + k;
        System.out.println(n);
        int i = arr.length - 1;
        while (n != 0) {

            int d = n % 10;
            arr[i] = d;
            n = n / 10;
            i--;
        }
        return arr;
    }

}
