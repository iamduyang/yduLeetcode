
/** 
 * 383. Ransom Note
 *  "Your runtime beats 84.83% of java submissions"
 */
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
    	int ransomNoteLength=ransomNote.length();
    	int magazineLength = magazine.length();
    	if(ransomNoteLength>magazineLength)
    		return false;
    	int[] letterArray = new int[26];
    	for(int i=0;i<26;i++)
    		letterArray[i]=0;
    	for(int i=0;i<magazineLength;i++)
    		letterArray[magazine.charAt(i)-97]++;
    	
    	for(int i=0;i<ransomNoteLength;i++){
    		letterArray[ransomNote.charAt(i)-97]--;
    		if(letterArray[ransomNote.charAt(i)-97]<0)
    			return false;
    	}
    	return true;
    			
    			
    	
    }
}

