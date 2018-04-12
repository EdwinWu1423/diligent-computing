/**
  Solves the Maze problem.

  For v0 base cases:
  o  if the explorer's position is on treasure, return true
  o  if the explorer's position is on wall, return false

*/

public class MazeSolver {
	private Maze maze;
	public MazeSolver(Maze maze){
		this.maze = maze;
		solve();
	}

	public boolean solve(){
		if(maze.explorerIsOnA() == Maze.TREASURE)
			return true;
		if(maze.explorerIsOnA() == Maze.WALL)
			return false;
		return false;
	}

}
