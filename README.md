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

## version*n* wish list

## known bugs
snapshot of the new maze does not work yet