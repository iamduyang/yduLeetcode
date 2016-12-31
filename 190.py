class Solution:
    # @param n, an integer
    # @return an integer
    def reverseBits(self, n):
    	retrunNum =0
    	count =n
        for x in xrange(1,33):
        	print x
        	retrunNum = retrunNum+pow(2,32-x)*(count%2)
        	count = count/2
        
        return retrunNum
        