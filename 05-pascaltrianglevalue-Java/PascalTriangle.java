// Write the function pascalsTriangleValue(row, col) 
// that takes int values row and col, and returns the 
// value in the given row and column of Pascal's 
// Triangle where the triangle starts at row 0, and 
// each row starts at column 0. If either row or col 
// are not legal values, return 0, instead of crashing. 

class PascalTriangle {
	public int factorial(int n) {
		int p = 1;
		for (int i = 1; i <= n; i++) {
			p = p * i;
		}
		return p;
	}
	public int pascalsTriangleValue(int row, int col){
		// your code goes here
		if (col > row)
			return 0;
		if (row == col || col == 0)
			return 1;
		if (col == row - 1 || col == 1)
			return row;
		int n = factorial(row);
		int a = factorial(col);
		int b = factorial(row-col);
		System.out.println("Here is the output:" + (n / (a * b)));
		return (n / (a * b));
	}
}