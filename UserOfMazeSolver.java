/**
  Test MazeSolver class.
  
  Requires command line arguments:
  o  the name of a file containing a maze.
  o  the rank and file where an explorer is starting
  For example,
      java UserOfMazeSolver mazes/4cell_treasureWest.txt -1 -1  # no explorer
*/

public class UserOfMazeSolver {
    private static Displayer picture;
    public static void main(String[] commandLine) 
        throws java.io.FileNotFoundException {
        Maze maze = new Maze( commandLine[0]
                            , Integer.parseInt( commandLine[1])
                            , Integer.parseInt( commandLine[2])
                            );
        int length = Integer.parseInt(commandLine[3]);
        
        baseTest(maze, length);

    }

    private static void baseTest(Maze maze, int length) {
        MazeSolver.displayer(length);
        System.out.println( MazeSolver.solve(maze));
        
        
    }
}
