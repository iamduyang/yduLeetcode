/**
 * 365. Water and Jug Problem
 */
public class Solution {
    public boolean canMeasureWater(int x, int y, int z) {
        if(x+y<z)
            return false;
        if(x==z||y==z||x+y==z)
            return true;
        return z%getGCD(x,y)==0;

    }
    public int getGCD(int x,int y){

       while(y!=0){
           int temp=y;
           y=x%y;
           x=temp;
       }
       return x;
    }
}


