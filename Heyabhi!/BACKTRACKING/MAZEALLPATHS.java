package BACKTRACKING;

import java.util.Arrays;

public class MAZEALLPATHS {
    static void allpaths(String p,int r,int c,boolean [][] maze,int [][]path,int step){
        if (r== maze.length-1 && c==maze[0].length-1){
            path[r][c]=step;
            for (int [] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        path[r][c]=step;
            if (r < maze.length - 1) {
                allpaths(p + "down ", r + 1, c, maze, path, step+1);
            }
            if (c < maze[0].length - 1) {
                allpaths(p + "right ", r, c + 1, maze, path, step+1);
            }
            if (r>0){
                allpaths(p+"up ",r-1,c,maze,path,step+1);
            }
            if (c>0){
                allpaths(p+"left  ",r,c-1,maze,path,step+1);
            }
        maze[r][c]=true;
    }


    public static void main(String[] args) {
        boolean [] [] baord={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int [] [] path=new int[baord.length][baord[0].length];
        allpaths("",0,0,baord,path,1);
    }
}
