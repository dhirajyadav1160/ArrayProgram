import java.util.*;
public class InputAndPrint {
 
 public static int[] input()
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Length of Array...");
     int n=sc.nextInt();
     System.out.println("Enter the "+n+" Element of Array..");
     int arr[]=new int[n];
     for (int i = 0; i < arr.length; i++) {
        arr[i]=sc.nextInt();
    }
    return arr;
 }
 public static void printArray(int arr[])
 {
     for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]+" ");
    }
 }
 
}
