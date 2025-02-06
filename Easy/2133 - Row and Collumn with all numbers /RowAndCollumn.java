import java.util.Set;

class Solution {
    /** 
    * An n x n matrix is valid if every row and every column contains all the integers from 1 to n (inclusive).
    * Given an n x n integer matrix matrix, return true if the matrix is valid. Otherwise, return false.
    */
    public boolean checkValid(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
            Set<Integer> checked = new HashSet<Integer>();
            for(int j = 0; j < matrix.length; j++){
                if(matrix[i][j] <= matrix.length){
                    checked.add(matrix[i][j]);
                }
            }
            if(checked.size() != matrix.length){
                return false;
            }
        }
        for(int i = 0; i < matrix.length; i++){
            Set<Integer> checked = new HashSet<Integer>();
            for(int j = 0; j < matrix.length; j++){
                if(matrix[j][i] <= matrix.length){
                    checked.add(matrix[j][i]);
                }
            }
            if(checked.size() != matrix.length){
                return false;
            }
        }
        return true;
    }
}