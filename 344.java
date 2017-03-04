/** 
 * 344. Reverse String
 */
public class Solution {
    public String reverseString(String s) {
        int lenS = s.length();
        char[] wordArray = s.toCharArray();
        int i=lenS-1;
        int j=0;
        char temp='a';
       while(i>j){
         temp=wordArray[i];
         wordArray[i] =wordArray[j];
           wordArray[j] =temp;
           j++;
           i--;
       }
       return new String(wordArray);
    }
}