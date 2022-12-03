import java.util.*;
public class MaxDiffrence {
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
    
    public static void main(String[] args) {
        int arr[]=input();
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i+1]>arr[i])
            {
                if(max<arr[i+1]-arr[i])
                    max=arr[i+1]-arr[i];
                if(i+1==arr.length-1)
                    break;
            }
        }
        System.out.println(max);
        
    }

}
//2 7 9 5 1 3 5 output=5
//7 6 9 3 6 0 6 output=6
//4 6 9 15 2 6 9 output=6