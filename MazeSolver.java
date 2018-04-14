/**
  Solves the Maze problem.
  For v0 base cases:
  o  if the explorer's position is on treasure, return true
  o  if the explorer's position is on wall, return false
*/

public class MazeSolver {
	private static int step = 0;
	private static Displayer displayer;
	private final static int[] DIRECTIONS = new int[]{Maze.NORTH, Maze.EAST, Maze.SOUTH, Maze.WEST};

	/**
	  Creates a new reference to an object of class Displayer given the windowHeight.
	*/
	public static void display(int windowHeight){
		displayer = new Displayer(windowHeight);
	}

	/**
	  @return the boolean value of the statement:
	  		  "the maze is navigable, having a legal travel path that is continuous from starting location to existing treasure"
	*/
	public static boolean solve(Maze maze){
		displayerTest(maze);
		if(maze.explorerIsOnA() == Maze.TREASURE)
			return true;
		else if(maze.explorerIsOnA() == Maze.WALL)
			return false;
		else {
			// wall makes sure it does not keep returning to current position
			maze.dropA(Maze.WALL);
			// take a snapshot of the maze currently
			Maze snapshot = new Maze(maze);
			for(int direction : DIRECTIONS) {
				maze.go(direction);
				if (solve(maze)) // recursive abstraction
					return true;
				// else, backtrack using a copy constructor to reference a new Maze that looks like snapshot
				maze = new Maze(snapshot); 
				displayerTest(maze);
			}	
		}
		return false;
	}

	/**
	  Keeps track of the current step in the maze that is displayed to the user.
	*/
	private static void displayerTest( Maze m) {
        displayer.atTopOfWindow( m + "step " + step++);
    }
}

