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
When I am asked for a legal travel path that is continuous from starting location to existing treasure with n choices, the recursive abstraction can find a legal travel path with n-1 choices.

## base case
if the location of the explorer is at the location of the treasure, return the solution
if there are no legal paths, return

## English or pseudocode description of algorithm
if location of explorer equals location of treasure
	return the solution
else if no legal paths
	return
else
	for each position in maze
		test each possible next position (up, down, left or right relative to current explorer position) to see if position is legal
		if legal position
			invoke recursive abstraction
		move current position to the previous position
## class(es), with fields and methods

## version*n* wish list