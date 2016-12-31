class Solution(object):
    def hammingWeight(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n<2:
        	return n
        else:
        	return n%2+self.hammingWeight(n/2) 