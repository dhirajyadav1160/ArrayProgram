import java.util.*;
public class ArrayRotation {
    static void Rotate(int arr[], int d) {
        int n=arr.length;
        int temp[] = new int[n];

        int k = 0;

        for (int i = d; i < n; i++) {
            temp[k] = arr[i];
            k++;
        }

        for (int i = 0; i < d; i++) {
            temp[k] = arr[i];
            k++;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    static void PrintTheArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array...");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the "+n+" Element of Array");
        input(arr);
        System.out.println("Enter the length of Queries...");
        int m = sc.nextInt();
        System.out.println("Enter the "+m+" Element  of Queries...");
        int qu[] = new int[m];
        input(qu);

        for (int i = 0; i < qu.length; i++) {
            int d = qu[i];
            Rotate(arr, d);
        }
        PrintTheArray(arr);
    }

    private static void input(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

    }
}