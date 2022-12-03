import java.util.Scanner;
public class Prime
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("put the number");
        int number=sc.nextInt();
        boolean num=CheckPrime(number);
        if(num)
            System.out.println(number+" is a Prime Number");
        else 
            System.out.println(number+" is not a Prime Number");
    }
     static boolean CheckPrime(int n) 
     {
         int count=0;
         
         for(int i=1;i<=n;i++)
         {
             if(n%i==0)
                  count++;
         }
         if(count==2)
         return true;
         else
             return false;
     }
}