/** 
 * 389. Find the Difference
 */


public class Solution {
    public char findTheDifference(String s, String t) {
        int returnChar = t.charAt(s.length());
        for (int i = 0; i < s.length(); ++i) {
              returnChar -= (int)s.charAt(i);
              returnChar += (int)t.charAt(i); 
        }
        return (char)returnChar;
    }
}