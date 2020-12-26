package Algorithm.Middle;

public class SumOfSquareNumbers {

}

class Solution {
    public boolean judgeSquareSum(int c) {
        if(c < 0) {
            return false;
        }else {}
        int i = 0, j = (int)Math.sqrt(c);
        while (i <= j){
            int powSum = i * i + j * j;
            if(powSum == c){
                return true;
            }else if(powSum > c){
                j--;
            }else if(powSum < c){
                i++;
            }
        }
        return false;
    }
}