package CodingChallenge;

public class Palindrome {
    public static boolean Palindrome(String str) {
        int num = 0;
        for(int i=0; i<str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-i-1)) {num++;}
            if(num > 1) {break;}
        }

        if(num==0 && str.length()%2 == 1) {num++;}

        return num==1;
    }

    public static void main(String[] args) {
        String str = "114421";
        System.out.println(Palindrome(str));
    }
}