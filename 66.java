public class Solution {
    public int[] plusOne(int[] digits) {
        int lengthDigits = digits.length;
        int flag = 1;
        int tempSum=0;
        for(int ii = lengthDigits-1;ii>=0;ii-- ){
        	tempSum = digits[ii]+flag;
        	
        	if(tempSum<10){
        		digits[ii] = tempSum;
        		return digits;
        	}
        	else{
        		digits[ii] = tempSum-10;
        		flag=1;
        	}	
        		
        }
        int[] returnDigit = new int[lengthDigits+1];
        returnDigit[0]=1;
        for(int ii=0;ii<lengthDigits;ii++){
        	returnDigit[ii+1] = digits[ii];
        }
        return returnDigit;
    }
}