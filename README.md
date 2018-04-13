# diligent-computing

## personnel
Tina Wong and Edwin Wu

## statement of problem
Returns the Boolean value of the statement “the maze is navigable, having a legal
travel path that is continuous from starting location to existing treasure”

legal meaning:
- do not cross the walls
- right-angle turns only
- a path cannot go through the same point twice

## recursive abstraction
When I am asked to return the Boolean value of the statement "the maze is navigable, having a legal travel path that is continuous from starting location to existing treasure", the recursive abstraction can return the Boolean value of the statement "the maze is navigable, having a legal travel path that is continuous from starting location to existing treasure" for a maze after the explorer has moved one stepping stone.

## base case
if the location of the explorer is at the location of the treasure, return true

if explorer's location is initialized in a wall, return false

## English or pseudocode description of algorithm
```
if location of explorer equals location of treasure
	return true
else if no legal paths
	return false
else
	for each direction (up, down, left or right) in maze
		take a snapshot of current maze
		drop a wall
		move explorer to the possible next position (up, down, left or right relative to current explorer position) in that order to see if position is legal
		if recursive abstraction is true
			return true
		if there are no legal paths to take
			backtrack to the previously recorded position
```
## class(es), with fields and methods
#### UserOfMazeSolver
##### fields

##### methods
- baseTest, testing the method solve

#### MazeSolver
##### fields
- step, private static int
- displayer, private static field of class Displayer
- directions, private static int array consisting of the four directions

##### methods
- solve(Maze maze)
- displayer(int windowHeight)

#### UserOfMaze
##### fields
- displayer, private static field of class Displayer

##### methods
- moveTest(Maze maze)
- dropTest(Maze maze)
- copyConstructTest(Maze old)
- displayerTest(Maze m)
- snapshotDemo(Maze candidate)

#### Maze
##### fields
- treasure, public final static int
- wall, public final static int
- stepping_stone, public final static int
- east, public final static int
- north, public final static int
- west, public final static int
- south, public final static int
- maze, private int 2D array
- max_ranks, private final static int
- rankCount, private int
- explorerPosition, private field of class Vector

##### methods
- toString()
- go(int direction)
- dropA(int mazeElement)
- explorerIsOnA()
- equals(int rank, int file)

#### Vector
##### fields
- rank, private int
- file, private int

##### methods
- add(int ranks, int files)

## version*n* wish list
- show all solutions

## known bugs

