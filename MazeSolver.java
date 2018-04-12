/**
  Solves the Maze problem.

  For v0 base cases:
  o  if the explorer's position is on treasure, return true
  o  if the explorer's position is on wall, return false

*/

public class MazeSolver {
	private static int[] directions = new int[]{Maze.NORTH, Maze.EAST, Maze.SOUTH, Maze.WEST};

	public static boolean solve(Maze maze){
		if(maze.explorerIsOnA() == Maze.TREASURE)
			return true;
		else if(maze.explorerIsOnA() == Maze.WALL)
			return false;
		else {
			Maze snapshot = new Maze(maze);
			for(int direction : directions) {
				// take a snapshot of the maze currently
				
				// wall makes sure it does not keep returning to current position
				maze.dropA(Maze.WALL);
				maze.go(direction);
				if (solve(maze))
					return true;
				maze = snapshot;
			}
		}
		return false;
	}
}
