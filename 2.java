public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null)
        	return null;
        if(l1==null)
        	return l2;
        if(l2==null)
        	return l1;
        int tempSum =l1.val+l2.val;
        ListNode returnNode =new  ListNode(tempSum%10);
        ListNode rTravel =  returnNode;
        int flag=0;
        if(tempSum>9)
        	flag=1;
        while(l1.next!=null&&l2.next!=null){
        	l1=l1.next;
        	l2=l2.next;
        	tempSum =l1.val+l2.val+flag;
        	rTravel.next=new  ListNode(tempSum%10);
        	 if(tempSum>9)
             	flag=1;
        	 else 
        		flag=0;
        	 rTravel=rTravel.next;
        }
        ListNode secondPhase =null;
        if(l1.next!=null)
        	secondPhase=l1.next;
        else
        	secondPhase=l2.next;
        while(secondPhase!=null){
        	tempSum =secondPhase.val+flag;
        	
        	rTravel.next=new  ListNode(tempSum%10);
        	 if(tempSum>9)
              	flag=1;
         	 else 
         		flag=0;
        	
        	secondPhase=secondPhase.next;
        	 rTravel=rTravel.next;
        }
        if(flag==1)
        	rTravel.next=new  ListNode(1);

    	return returnNode;
        
    }
}