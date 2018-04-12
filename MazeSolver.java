/**
  Solves the Maze problem.

  For v0 base cases:
  o	 if the explorer's position is on treasure, return true
  o  if the explorer's position is on wall, return false

*/

public class MazeSolver {
	public boolean solveMaze(Maze maze){
		if(maze.explorerIsOnA() == WALL)
			return false;
		if(maze.explorerIsOnA() == TREASURE)
			return true;
		
	}

}