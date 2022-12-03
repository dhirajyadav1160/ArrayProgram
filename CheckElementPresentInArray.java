//import java.util.Scanner;
//public class CheckElementPresentInArray {
//  public static void main(String args[]) {
//    float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter number");
//    float num = sc.nextFloat();
//    boolean isInArray = false;
//    for(float element:marks){
//      if(num==element){
//        isInArray = true;
//        break;
//      }
//    }
//    if(isInArray){
//      System.out.println("The value is present in the array");
//    }
//    else{
//      System.out.println("The value is not present in the array");
//    }
//  }
//}
import java.util.*;
public class CheckElementPresentInArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for (int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the Element that has to find=");
        int find=sc.nextInt();
        boolean isArray=false;
        for (int i=0;i<arr.length;i++) {
            if(find==arr[i]) {
                isArray=true;
                break;
            }
            
                
        }
        if(isArray)
            System.out.println("yes");
        else
            System.out.println("no");

    }

}
