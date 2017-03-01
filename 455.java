/** 
 * 455. Assign Cookies
 */
public class Solution {
    public int findContentChildren(int[] g, int[] s) {
    	int countChildren = 0;
        int gLen =g.length;
        int sLen =s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int countG =0;
        int countS = 0;
        while(countG<gLen&&countS<sLen){
        	if(g[countG]<=s[countS]){
        		countChildren++;
        		countG++;
        		countS++;
        		
        	}
        	else
        		countS++;
        		
        }
        
        return countChildren;
    }
