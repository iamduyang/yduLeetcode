public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> returnList = new ArrayList<String>();
        for(int i=1;i<=n;i++){
        	String tempString = "";
        	if(i%3==0||i%5==0){
        		if(i%3==0)
        			tempString+="Fizz";
        		if(i%5==0)
        			tempString+="Buzz";
        	}
        	else
        		tempString +=i;
        	returnList.add(tempString);
        }
        return returnList;
    }
}