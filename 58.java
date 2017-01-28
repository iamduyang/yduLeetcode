public class Solution {
	public int lengthOfLastWord(String s) {
		if(s ==null || s.trim().equals(""))
			return 0;

		String[] sArray = s.trim().split(" ");
		return  sArray[sArray.length - 1].length();
				
	}
}