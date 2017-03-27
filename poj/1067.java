
/**
 * http://poj.org/problem?id=1067
 * */


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String line = scan.nextLine();
            String[] lineSplit=line.split(" ");
            int nums1=Integer.parseInt(lineSplit[0]),nums2=Integer.parseInt(lineSplit[1]);

            int winOrNot=getWinOrNot(nums1,nums2);
            System.out.println(winOrNot);
        }
        scan.close();
    }
    public static int getWinOrNot(int a,int b){
        if(a<b){
            a^=b;
            b^=a;
            a^=b;
        }
        int k=a-b;
        a=(int)(k*(1+Math.sqrt(5))/2.0);
        if(a==b)
            return 0;
        return 1;
    }

}

