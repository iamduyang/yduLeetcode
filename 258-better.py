class Solution(object):
	def addDigits(self, num):
 
		while num >9:
			numOut = 0
			while num>9:
				numOut =numOut+ num%10
				num =num/10
			num = numOut+num
			 

		return num
			