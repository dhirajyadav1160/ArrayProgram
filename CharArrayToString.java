import java.util.Arrays;

public class CharArrayToString {
    public static void main(String[] args) {
        char ch[]= {'d','h','i','r','a','j'};
        String st="";
        StringBuilder sb=new StringBuilder();
        st=Arrays.toString(ch);
        //st=new String(ch);
        System.out.println(st);
    }

}
