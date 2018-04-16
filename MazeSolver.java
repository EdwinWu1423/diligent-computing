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
	  Creates a new instance of class Displayer given the windowHeight.
	*/
	public static void display(int windowHeight){
		displayer = new Displayer(windowHeight);
	}

	/**
	  @return the boolean value of the statement:
	  		  "the maze is navigable, having a legal travel path that is continuous from starting location to existing treasure"
	  and displays the maze
	*/
	public static boolean solve(Maze maze){
		// keeps track of the current step in the maze that is displayed to the user.
		displayer.atTopOfWindow( maze + "step " + step++);
		if(maze.explorerIsOnA() == Maze.TREASURE) // if explorer is on a treasure, return true
			return true;
		else if(maze.explorerIsOnA() == Maze.WALL) // if explorer is on a wall, return false
			return false;
		else if(maze.explorerIsOnA() == Maze.STEPPER) // if explorer is on a stepping stone that it has already been on, return false
			return false;
		else {
			// drops a stepper to make sure the explorer does not keep returning to current position
			maze.dropA(Maze.STEPPER);
			// take a snapshot of the maze currently
			Maze snapshot = new Maze(maze);
			for(int direction : DIRECTIONS) { // iterate through the four directions
				maze.go(direction); // move one step into that direction
				if (solve(maze)) // recursive abstraction
					return true;
				// else, backtrack using a copy constructor to reference a new Maze that looks like snapshot
				maze = new Maze(snapshot); 
				displayer.atTopOfWindow( maze + "step " + step++);
			}	
		}
		return false;
	}

}

