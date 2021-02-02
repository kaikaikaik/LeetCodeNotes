package Algorithm.Middle;

public class findNumberIn2DArray {

    public boolean findArray(int[][] matrix, int target) {
        // 时间复杂度n  * m
//        for(int i = 0; i < matrix.length; i++){
//            for(int j = 0; j < matrix[0].length; j++){
//                if(matrix[i][j] == target){
//                    return true;
//                }
//            }
//        }

        if(matrix.length == 0){
            return false;
        }
        int i = 0, j = matrix[0].length - 1;
        while(i < matrix.length && j >= 0){
            if(matrix[i][j] == target){
                return true;
            }else if(matrix[i][j] < target){
                i++;
            }else if(matrix[i][j] > target){
                j--;
            }
        }
        return false;
    }
}
