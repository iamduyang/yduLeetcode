class Solution(object):
    def isAnagram(self, s, t):
        lenS = len(s)
        lenT = len(t)
        if lenS != lenT:
            return False
        if lenS == 0:
            return True
        dictionOFS = {}
        for ii in range(0, lenS):
            if dictionOFS.has_key(s[ii]):
                dictionOFS[s[ii]] = dictionOFS[s[ii]] + 1
            else :
                dictionOFS[s[ii]] = 1
        for ii in range(0,lenT):
            if not dictionOFS.has_key(t[ii]):
                return  False
            dictionOFS[t[ii]] = dictionOFS[t[ii]] -1
            if dictionOFS[t[ii]]==0:
                del(dictionOFS[t[ii]])

        return True