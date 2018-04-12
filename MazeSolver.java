/**
  Solves the Maze problem.

  For v0 base cases:
  o  if the explorer's position is on treasure, return true
  o  if the explorer's position is on wall, return false

*/

public class MazeSolver {

	public static boolean solve(Maze maze){
		if(maze.explorerIsOnA() == Maze.TREASURE)
			return true;
		else if(maze.explorerIsOnA() == Maze.WALL)
			return false;
		else {
			// wall makes sure it does not keep returning to current position
			maze.dropA(Maze.WALL);
			// take a snapshot of the maze currently
			Maze snapshot;
			snapshot = new Maze(maze);
		}
		return false;
	}

}
