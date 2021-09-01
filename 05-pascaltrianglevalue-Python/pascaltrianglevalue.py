# Write the function pascalsTriangleValue(row, col) 
# that takes int values row and col, and returns the 
# value in the given row and column of Pascal's 
# Triangle where the triangle starts at row 0, and 
# each row starts at column 0. If either row or col 
# are not legal values, return None, instead of crashing. 

def factorial(n):
    if n == 0:
        return 1
    return (n * factorial(n-1))

# to find the value in the given row and column
# using ncr formula as each value can be given as a combination of rows and columns
def fun_pascaltrianglevalue(row, col):
    if(row == col and col == 1):
        return 1
    # as ncn-r and ncr will have same value and will be equal to n
    elif(col == row-1 and col == 1):
        return(row)
    # ncr formula is not applicable when n<r
    elif(col > row):
        return 0
    else:
        return(int((factorial(row)/(factorial(col)*(factorial(row-col))))))

