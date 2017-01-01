class Solution:
    # @param {integer[]} nums
    # @return {string}
    def largestNumber(self, nums):
        listOFString =[]
        ifZero =True

        for x in nums:
            if x!=0:
                ifZero =False
            listOFString.append(str(x))
        if ifZero:
            return "0"

        reTurnStringList = self.largestString(listOFString)
        reTurnString = ""
        for x in reTurnStringList:
            reTurnString = reTurnString+x

        return reTurnString

    def largestString(self,listOFString):
        lenString = len(listOFString)
        for ii in range(0,lenString):
            for jj in range(ii+1,lenString):
                if  self.compareString(listOFString[ii],listOFString[jj]):
                    temp = listOFString[ii]
                    listOFString[ii] = listOFString[jj]
                    listOFString[jj] =temp

        return listOFString



        
    def compareString(self,string1,string2):
        returnString = string1
        countI = 0
        lenStr1 = len(string1)
        lenStr2 = len(string2)
        lenMin = lenStr1
        if lenStr1>lenStr2:
            lenMin = lenStr2

        while countI<lenMin:
            if string1[countI]>string2[countI]:
                return False
            elif string1[countI]<string2[countI]:
                return True
            countI = countI+1


        if lenStr1>lenStr2:
            return self.compareString(string1[lenStr2:],string2)
        elif lenStr1<lenStr2:
            return self.compareString(string1,string2[lenStr1:])
        else :
            return False

