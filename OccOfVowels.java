import java.util.*;
public class OccOfVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=toLoweCase(str);
        int vowels[]=new int[26];
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                vowels[str.charAt(i)-97]++;
            }
        }
        for (int i = 0; i < vowels.length; i++) {
            if(vowels[i]>0) {
            System.out.print((char)(i+97)+""+(vowels[i]));
            }
        }
        

    }

    private static String toLoweCase(String str) {
        String str1="";
        for (int i = 0; i < str.length(); i++) {
            if((str.charAt(i))>='A'&&str.charAt(i)<='Z')
                str1=str1+(char)(str.charAt(i)+32);
            else
                str1=str1+str.charAt(i);
                
                
                
        }
        return str1;
        
    }

}
