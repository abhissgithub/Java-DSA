package BACKTRACKING;

public class MAZEPATHRESTICTION
{
//    OBSTACLES IN PATH
    static void restrict(String p, boolean[] [] maze, int r, int c)
    {
        if (r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;

        }

        if (!maze[r][c]){
            return;
        }
        if (maze[r][c])
            if (r< maze.length-1){
                restrict(p+"Down ",maze,r+1,c);


            }
            if (c<maze[0].length-1){
                restrict(p+"right ",maze,r,c+1);

            }


        }


    public static void main(String[] args) {
        boolean [][] rock={
                {true,true,true},
                {true,false,true},
                {true,true,true}
                };
        restrict("",rock,0,0);
    }
}
