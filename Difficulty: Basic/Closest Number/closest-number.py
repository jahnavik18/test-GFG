class Solution:
    def closestNumber(self, n, m):
        # code here 
        mul = n//m
        
        # find the closest lower multiple to n
        low = mul*m
        
        # find the closest higher multiple from lower multiple
        high = (mul+1)*m
        
        # compare to find the closest multiple between higher and lower
        # if equidistant give for higher abs value one, else the closest one
        if abs(low-n) > abs(high-n):
            return high
        elif abs(low-n) < abs(high-n):
            return low
        else:
            return low if abs(low)>abs(high) else high
        