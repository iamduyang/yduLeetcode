
/** 
 * 20. Valid Parentheses
 */
public class Solution {
    public boolean isValid(String s) {
        int sLen=s.length();
        if(sLen<1)
        	return true;
        
        Stack<Character> parenthesesStack = new  Stack<Character>();
        for(int i=0;i<sLen;i++){
        	char thisChar = s.charAt(i);
        	switch(thisChar){
        	case '{':
        		parenthesesStack.push('}');
        		break;
        	case '[':
        		parenthesesStack.push(']');
        		break;
        	case '(':
        		parenthesesStack.push(')');
        		break;
        	case ']':
        	case '}':
        	case ')':
        		if(parenthesesStack.isEmpty())
        			return false;
        		char compareChar= parenthesesStack.pop();
        		if(compareChar!=thisChar)
        			return false;
        		break;
        	default:
        		
        	}
        }
        if(!parenthesesStack.isEmpty())
        	return false;
        
        return true;
    }
}

