class Solution {
    boolean seen[][]; //for keeping track of the visited grid
    public int maxAreaOfIsland(int[][] grid) {
        int max_area = 0;
        int row = grid.length;
        int col = grid[0].length;
        
        seen = new boolean[row][col];
        
        for(int i = 0;i<row;i++){
            for(int j = 0 ; j<col;j++){
              max_area = Math.max(max_area,area(grid,i,j)); // recussievely calling area function and storing max value 
            }
        }
       return max_area ; 
    }
    
    public int area(int[][] grid,int row,int column){
        if(row < 0 || row >=grid.length || column < 0 ||
         column >= grid[row].length || seen[row][column] || grid[row][column]==0)
            return 0; // return 0 when grid == 0
        
        seen[row][column] = true; //if visited make that grid to true
        
        return(1+area(grid,row+1,column)+area(grid,row-1,column)+
              area(grid,row,column+1)+area(grid,row,column-1)); // it will calculate area 
    }
}