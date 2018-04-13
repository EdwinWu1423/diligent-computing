/**
  Solves the Maze problem.
/**
  Solves the Maze problem.
  For v0 base cases:
  o  if the explorer's position is on treasure, return true
  o  if the explorer's position is on wall, return false
*/

public class MazeSolver {
	private static int step = 0;
	private static Displayer picture;
	public static void displayer(int length){
		picture = new Displayer(length);
	}
	private static int[] directions = new int[]{Maze.NORTH, Maze.EAST, Maze.SOUTH, Maze.WEST};

	public static boolean solve(Maze maze){
		displayerTest(maze);
		if(maze.explorerIsOnA() == Maze.TREASURE)
			return true;
		else if(maze.explorerIsOnA() == Maze.WALL)
			return false;
		else {
				maze.dropA(Maze.WALL);
			// wall makes sure it does not keep returning to current position
				Maze snapshot = new Maze(maze);
			// take a snapshot of the maze currently
				
				
			
			for(int direction : directions) {
				
				
				maze.go(direction);
				
				if (solve(maze)){
					return true;
				
				maze = new Maze(snapshot);
				displayerTest(maze);
			}
		}
		return false;
	}
}

	private static void displayerTest( Maze m) {
        

        picture.atTopOfWindow( m + "step " + step++);

       

       
        }
    }

