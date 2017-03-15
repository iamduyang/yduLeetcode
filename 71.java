/** 
 * 71. Simplify Path
 */
public class Solution {
    public String simplifyPath(String path) {
      if(path.length()<2)
    	  return path;
      boolean flag = path.charAt(0)=='/';
      String[] pathArray;
      if(flag)
    	  pathArray = path.substring(1, path.length()).split("/");
      else
    	  pathArray = path.split("/");
      Stack<String> pathStack =new Stack<String>();
      for(int i=0;i<pathArray.length;i++){
    	 
    	  if(pathArray[i].equals("..")){ // this case is the most important
    		  if(!pathStack.isEmpty())
    			  pathStack.pop();
    		  
    	  }
    	  else if(pathArray[i].equals("."))
    		  continue;
    	  else if(pathArray[i].equals(""))
    		  continue;
    	  else if(pathArray[i].equals("/"))
    		  continue;
    	  else
    		  pathStack.push(pathArray[i]);
    		  
      }
      String returnString="";
      if(!pathStack.isEmpty())
    	  returnString=pathStack.pop();
      while(!pathStack.isEmpty()){
    	  returnString= pathStack.pop()+"/"+returnString;
      }
      if(flag)
    	  returnString= "/"+returnString;
      return returnString;
       
    }
}
