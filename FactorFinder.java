package array;

import java.util.*;

public class FactorFinder {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num =sc.nextInt();
        int temp=num;
        
        ArrayList<Integer> factors = new ArrayList<Integer>();
        
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                factors.add(i);
                num /= i;
                i--;
            }
        }
        
        System.out.print("Factors of " + temp + " = ");
        for (int i = 0; i < factors.size(); i++) {
            if (i == factors.size() - 1)
                System.out.print(factors.get(i));
            else
                System.out.print(factors.get(i) + "x");
        }
        System.out.println();
    }
}