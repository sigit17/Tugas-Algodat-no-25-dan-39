package rateinmaze;
public class Driver {
    public static void main(String args[])
    {
        int N = 5;
        Rateinmaze rat = new Rateinmaze(5);
        int [][] maze = { { 1, 0, 1, 1,1 }, { 1, 1, 1, 0,1 }, { 0, 0,0, 1, 1 },
				{ 0, 0, 0, 1,0 },{ 0, 0,0, 1, 1 } };
        Rateinmaze r = new Rateinmaze(N);
        r.solveMaze(maze, N);
    }
}
