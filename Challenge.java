public class Challenge {
    public static void main(String[] args) {
        System.out.println(stringChallenge("Today, is the greatest day ever!"));
    }
    public static String stringChallenge(String str) {
        int max = 0;
        String word ="";
        int m=0;
        for (int i = 0; i < str.length(); i++) 
        {
            {
                int count = 0;
                String current;
                current= str.substring(m, i);
                m=i+1;
                for (int j = 0; j < current.length(); j++) {
                    for (int k = j + 1; k < current.length(); k++) {
                        if (current.charAt(j) == current.charAt(k)) {
                            count++;
                        }
                    }
                }
                if (count > max) {
                    max = count;
                    word = current;
                }
            }
        }
        return (max == 0) ? "-1" : word;
    }
}