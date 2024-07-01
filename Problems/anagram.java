import java.util.*;
public class anagram {  

    static void check_anagram(String s1 , String s2){
        // convert both strings to char array
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        // sort both char arrays
        Arrays.sort(c1);
        Arrays.sort(c2);
        // compare both char arrays
        if(Arrays.equals(c1, c2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not anagram");
        }
    }
    public static void main(String[] args) {
        
        // anagram meansif letters from one string can be rearranged to form of other String
        // eg: "listen" and "silent" are anagram of each other

        check_anagram("anand", "naad");
        

    }
}
