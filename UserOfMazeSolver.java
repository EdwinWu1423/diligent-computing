/**
  Test MazeSolver class.
  
  Requires command line arguments:
  o  the name of a file containing a maze.
  o  the rank and file where an explorer is starting
  o  the height of your shell window as a final argument
  For example,
      java UserOfMaze mazes/4cell_treasureWest.txt 0 3 25
*/

public class UserOfMazeSolver {

    public static void main(String[] commandLine) 
        throws java.io.FileNotFoundException {
        Maze maze = new Maze( commandLine[0]
                            , Integer.parseInt( commandLine[1])
                            , Integer.parseInt( commandLine[2])
                            );
        int windowHeight = Integer.parseInt(commandLine[3]);
        
        baseTest(maze, windowHeight);

    }

    private static void baseTest(Maze maze, int windowHeight) {
        MazeSolver.displayer(windowHeight);
        System.out.println( MazeSolver.solve(maze));
        
        
    }
}
