class Solution:
    # @param n, an integer
    # @return an integer
    def reverseBits(self, n):
        retrunNum =0
        
        for x in xrange(1,33):
            retrunNum = 2*retrunNum+(n%2)
            n = n/2
        
        return retrunNum
        