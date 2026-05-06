class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> list = new ArrayList<>();
        int[][] directions = new int[][]{{1,0}, {0,1},{-1,0}, {0,-1}};
        char[] way = new char[]{'D', 'R', 'U', 'L'};
        check(maze, 0, 0, list, "", directions, way);
        Collections.sort(list);
        return list;
    }
    
    public void check(int[][] maze, int i, int j, ArrayList<String> list, String res, int[][] directions, char[] way) {
        if(i<0 || j<0 || i>=maze.length || j>=maze.length || maze[i][j] != 1)
            return;
        if(i == maze.length-1 && j == maze.length-1 && maze[i][j] == 1) {
            list.add(res);
            return;
        }
        maze[i][j] = 0;
        for(int k=0; k<4; k++) {
            check(maze, i+directions[k][0], j+directions[k][1], list, res+way[k], directions, way);
        }
        maze[i][j] = 1;
    }
}
 