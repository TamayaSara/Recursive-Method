# Recursive-Method
1. Written a recursive method <b>fib(int n)</b> that takes in and int n and returns the result of fibonacci’s nth term

<p>F(n) = F(n-1) + F(n-2)</p> 
<p>F(3) = F(2) + F(1) = 1 + 1 = 2</p>
<p>F(2) = F(1) + F(0) = 1 + 0 = 1</p>
<p>F(1) = 1 		//base case</p>
<p>F(0) = 0 		//base case</p>

2. Written a recursive method <b>getPowerOfXtoN(int xBase, int nExp)</b> that takes in 2 arguments, an int <b>xBase</b> (positive or negative), and a positive exponent <b>int nExp</b>. The method will use recursion to calculate and return the result.
<p>Xn = X * X(n-1)</p>
X1 = X * X(0)</p>
X0 = 1</p>
<p>getPowerOfXtoN(2,3);   //returns 8</p>
<p>getPowerOfXtoN(-2,3);   //returns -8 </p>

4. Written a recursive method <b>binarySearch(String target, String [ ] words)</b> that takes in 2 arguments, a String <b>target</b>, and an array of Strings<b> words</b>. The method will search for the target in the array, and either return the index location where it is found, or -1 if the target is not in the array. 
Note: Made a recursive helper method that make the solution recursive.

4. Written a recursive method <b>organizeParade(int paradeLength)</b> that takes in the length of the parade and returns the number of different ways it can be organized based on the rules below:

<p>A parade consists of Floats and Bands.</p>
<p>Bands cannot be consecutively placed</p>
<p>Floats can however be placed anywhere</p>
<p>P(n) = P(n-1) + P(n-2) when n>2</p>
<p>P(2) = 3 	//base case:  3 ways to organize  	F,B  || B,F  || F,F</p>
<p>P(1) = 2 	//base case:  2 ways to organize 	F || B 	  (only 1 item)</p>

5. Written a recursive method <b>numJarsNeeded(int candyCount, int jarCapacity)</b> that takes in the number of candies and the capacity of each jar.  The goal is to split the candies in half each time and store them in the jars, returning in the end the total number of jars needed to store all the candies based on the capacity.
Note: You can have as many jars as you need to store the candies.
Note: It’s not necessary to return the minimum number jars, however it is necessary to store all the candies.

Example: <b>10 candies</b> with jars having a <b>capacity of 2</b> would split the candies in half and deposit them into the jars such that. 10/2 = <b>5</b> , and then 5/2= 2 remainder 1
This results in <b>6 jars</b>being needed with their content being 2,2,1,2,2,1 candies.

Example: <b>16 candies </b>with jars having a <b>capacity of 4</b> would split the candies in half and deposit them into the jars such that. 16/2=8, and then 8/2= 4 no remainders
This results in <b>4 jars</b> being needed with their content being 4,4,4,4 candies.


