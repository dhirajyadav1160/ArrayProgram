package array;

import java.util.Scanner;

public class Matrix {
    public static int[] input() {
        System.out.println("Enter the Size of Matrix..");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int mat[] = new int[n1];
        System.out.println("Enter " + n1 + " Element of Matrix....");
        for (int i = 0; i < mat.length; i++) {
            mat[i] = sc.nextInt();
        }
        return mat;
    }

    public static void display(int[] mat) {
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i] + " ");
        }
    }
}
