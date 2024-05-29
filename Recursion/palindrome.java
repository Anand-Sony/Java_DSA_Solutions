public class palindrome {
    static int rev(int n){
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }

    static boolean isPalindrome(int n){
        if (n == rev(n)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 121;
        if (isPalindrome(n)) {
            System.out.println(n+" is a Palindrome");
        }
        else{
            System.out.println(n+ " is not a Palindrome");
        }
        
    
    }
    
}
