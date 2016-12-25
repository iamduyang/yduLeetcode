class Solution(object):
    def myPow(self, x, n):
        """
        :type x: float
        :type n: int
        :rtype: float
        """
        if n==0:
            return 1
        if n<0:
            n = -n
            x = 1.0/x

        return self.inPow(x,n)
        
    def inPow(self, x, n):
    	if n==0:
            return 1.0
        if (n%2 == 0):
            return self.inPow(x*x, n/2) 
            
        return self.inPow(x*x, n/2)*x
        
