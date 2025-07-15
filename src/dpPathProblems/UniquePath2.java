package dpPathProblems;

class UniquePath2{
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        final int m = obstacleGrid[0].length;
        final int n = obstacleGrid.length;
        final Integer [][] alreadyKnownPaths = new Integer[n][m];
        return uniquePaths(0,0, m-1,n-1, alreadyKnownPaths,obstacleGrid);
    }
    private int uniquePaths(
            final int startX,
            final int startY,
            final int endX,
            final int endY,
            final Integer [][] alreadyKnownPaths,
            final int[][] obstacleGrid
    ){
        if(startX < 0 || startX > endX || startY < 0 || startY > endY){
            return 0;
        }
        if (obstacleGrid[startY][startX] == 1) {
            return 0;
        }
        if(startX == endX && startY == endY){
            return 1;
        }
        if(alreadyKnownPaths[startY][startX] == null){
            alreadyKnownPaths[startY][startX] = uniquePaths(startX + 1, startY, endX, endY, alreadyKnownPaths, obstacleGrid)+
                    uniquePaths(startX, startY + 1, endX, endY, alreadyKnownPaths, obstacleGrid) ;
        }
        return alreadyKnownPaths[startY][startX];
    }

}
