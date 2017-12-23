# NBody Simulation
The program simulates the motion of N objects in a plane that accounts for gravitational forces that affect each other.

### `Planet` Class
The `Planet` class stores the following information for each planet as instance variables with its appropiate names.
- current position (x)
- current position (y)
- current velocity in direction x (xVelocity)
- current velocity in direction y (yVelocity)
- mass (mass)
- name of the image in the `images` directory thatis associated with (img)

###### The Physics Behind All This - plain and simple(ish)

Pairwise Force: *Newton's Law of Universal Gravitation* postulates the strength of the gravitational force between two objects can be determined by the product of their masses dividedby the square distance between the objects, scaledby the gravitational constant *G*(6.67 * 10^(-11) N-m^(2)/kg^(2). The tension of object onto another is through a line of the distance between them. 
The force is a vector, and therefore giving dx & dy positive and negative values. The relevant equations are the following:
- F = G * m1 * m2 / r^(2)
- r2 = dx^(2) + dy^(2)
- Fy = F * dy / r
- Fx = F * dx / r

Net Force: *The Principle of Superposition* asserts that thenet force acting on an object in the x- or y-direction is the sumation of the pairwiseforce acting on the particle in that direction.

Acceleration: *Newton's Second Law of Motion* establishes that the accerations in both x- and y- directions are given by the following:
- ax = Fx / m
- ay = Fy / m

#### `calcDistance` Method
Function: Calculates the distance bertween two planets
Arguments: Planet
Returns: double
In order to do this, one would find `dx` and `dy`, then use the coordinate distance formula to find the length between two points.

#### `calcForceExertedBy` Method
Function: Calculates the Pairwise Force, as described above
Arguments: Planet
Returns: double
In order to do this, the various equations associated with Pairwise Force ought to be calculated.

#### `calcNetForce` Method
Function: Update the Planet's net force to match the total amount of force exerted by those planets on the current planet
Arguments: Array of Planet objects
Returns: double
In order to do this, iterarte over the array

#### `draw` Method
Function: Draw the planet to the (x, y) coordiantes
Arguments: none
This uses StdDraw API from the Princeston Standard Library.

[More on testing, running the simulator, printing the universe later - sorry]
