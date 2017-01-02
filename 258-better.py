class Solution(object):
	def addDigits(self, num):
 
		while num >9:
			numStr = str(num)
			num = 0
			for ii in range(0,len(numStr)):
				num = num+int(numStr[ii])

		return num
			