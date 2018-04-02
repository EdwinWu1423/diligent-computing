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
When I am asked to return the Boolean value of the statement "the maze is navigable, having a legal travel path that is continuous from starting location to existing treasure" for a maze of n choices, the recursive abstraction can return the Boolean value of the statement "the maze is navigable, having a legal travel path that is continuous from starting location to existing treasure" for a maze of n-1 choices.

## base case
if the location of the explorer is at the location of the treasure, return true

if there are no legal paths, return false

## English or pseudocode description of algorithm
```
if location of explorer equals location of treasure
	return true
else if no legal paths
	return false
else
	for each position in maze
		test each possible next position (up, down, left or right relative to current explorer position) to see if position is legal
		if legal position
			invoke recursive abstraction
		move current position to the previous position
```
## class(es), with fields and methods

## version*n* wish list