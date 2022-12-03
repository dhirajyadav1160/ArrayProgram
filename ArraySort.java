package array;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr= {10,20,30,40,50,60};
        int big=arr[0];
        for (int i = 0; i < arr.length; i++) {
             if(arr[i]>big)
                 big=arr[i];
             
            
        }
    }

}
