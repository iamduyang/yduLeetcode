/**
 * 537. Complex Number Multiplication
 */
public class Solution {
    public String complexNumberMultiply(String a, String b) {
        int[] aVal = new int[2];
        int[] bVal  =new int[2];
        String[] aArray = a.split("\\+");
        String[] bArray = b.split("\\+");
        aVal[0]=Integer.parseInt(aArray[0]);
        bVal[0]=Integer.parseInt(bArray[0]);
        aVal[1]=Integer.parseInt(aArray[1].substring(0,aArray[1].length()-1));
        bVal[1]=Integer.parseInt(bArray[1].substring(0,bArray[1].length()-1));

       
        int[] returnArray = calulateComplex(aVal[0],aVal[1],bVal[0],bVal[1]);
        return returnArray[0]+"+"+returnArray[1]+"i";
    }
    public int[] calulateComplex(int aReal,int aIma, int bReal, int bIma){
        int[] returnNum = new int[2];
        returnNum[0] = aReal*bReal-aIma*bIma;
        returnNum[1] =aReal*bIma + bReal*aIma;
        return returnNum;
    }
}

