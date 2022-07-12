//2133. Check if Every Row and Column Contains All Numbers

class Solution {
public boolean checkValid(int[][] matrix) {
    Set<Integer> set;
    
    
    for(int i = 0 ; i < matrix.length; i++){
        set = new HashSet<>();
        for(int j = 0; j < matrix[i].length; j++){
            if(matrix[i][j]<matrix.length){
            if(set.contains(matrix[i][j]))
                return false;
            else
                set.add(matrix[i][j]);
            }
        }
    }
                            
    for(int i = 0 ; i < matrix[0].length; i++){
        set = new HashSet<>();
        for(int j = 0; j < matrix.length; j++){
            if(set.contains(matrix[j][i]))
                return false;
            else
                set.add(matrix[j][i]);
        }
    }
    return true;
}
}