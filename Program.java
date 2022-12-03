package array;
public class Program
{
    public static void findPrevSmaller(int[] arr)
    {
        if (arr == null || arr.length == 0) {
            return;
        }
        for (int i = 0; i < arr.length; i++)
        {
            int prev = -1;
 
            for (int j = i - 1; j >= 0; j--)
            {

                if (arr[j] <= arr[i])
                {
                    prev = arr[j];
                    break;
                }
            }
 
            System.out.print(prev + " ");
        }
    }
 
    public static void main(String[] args)
    {
        Matrix ms=new  Matrix();
        int[] arr = ms.input();
        findPrevSmaller(arr);
    }
}