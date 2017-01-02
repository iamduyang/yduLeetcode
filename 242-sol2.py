class Solution(object):
    def isAnagram(self, s, t):
        lenS = len(s)
        lenT = len(t)
        if lenS != lenT:
            return False
        if lenS == 0:
            return True

        dictionOFS = [0]*26
        for ii in range(0, lenS):
            indexOfIt =  ord(s[ii])-97
            dictionOFS[indexOfIt]=dictionOFS[indexOfIt]+1

        for ii in range(0,lenT):
            indexOfIt = ord(t[ii]) - 97
            dictionOFS[indexOfIt] = dictionOFS[indexOfIt] - 1

        for ii in dictionOFS:
            if ii!=0:
                return False
        return True