import math
class Solution(object):
    def arrangeCoins(self, n):
        return (int)math.floor(math.sqrt(2*n+0.25)-0.5)