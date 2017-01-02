class Solution(object):
	def addDigits(self, num):
 
		if num <10:
			return num
		else :
			numStr = str(num)
			countTotal = 0
			for ii in range(0,len(numStr)):
				countTotal = countTotal+int(numStr[ii])
			return self.addDigits(countTotal)