package Algorithm.Easy;


import java.util.Arrays;
import java.util.HashSet;

public class reverseVowels {
    public static void main(String[] args) {
        System.out.println(new ReverseSolution().reverse("hello"));
    }
}

class ReverseSolution{
    private final static HashSet<Character> vowels = new HashSet<>(Arrays.asList('a','o','e','i','u','A','O','E','I','U'));
    public String reverse(String s) {
        if(s == null) return null;
        int i = 0, j = s.length() - 1;
        char result[] = new char[s.length()];
        while (i <= j){
            if(!vowels.contains(s.charAt(i))){
                result[i] = s.charAt(i);
                i++;
            }else if(!vowels.contains(s.charAt(j))){
                result[j] = s.charAt(j);
                j--;
            }else{
                result[i] = s.charAt(j);
                result[j] = s.charAt(i);
                i++;
                j--;
            }
        }
        return new String(result);
    }
}