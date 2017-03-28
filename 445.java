
/**
 * 445. Add Two Numbers II
 */

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l2==null)
            return l1;
        if(l1==null)
            return l2;
        l1=reverseList(l1);
        l2=reverseList(l2);
        int flag=0;
        if((l1.val+l2.val)>9)
            flag=1;
        ListNode returnList=new ListNode((l1.val+l2.val)%10);
        l1=l1.next;
        l2=l2.next;
        ListNode curNode ,preNode=returnList;
        int tempVal;
        while(l1!=null&&l2!=null){
            tempVal = flag+l1.val+l2.val;
            if(tempVal>9){
                flag=1;
                tempVal=tempVal%10;
            }
            else
                flag=0;
            curNode= new ListNode(tempVal);
            preNode.next=curNode;
            preNode=curNode;
            l1=l1.next;
            l2=l2.next;
        }

        if(l2!=null)
            l1=l2;
        while (l1 != null) {
            tempVal = flag + l1.val;
            if (tempVal > 9) {
                flag = 1;
                tempVal = tempVal % 10;
            } else
                flag = 0;
            curNode = new ListNode(tempVal);
            preNode.next = curNode;
            preNode = curNode;
            l1 = l1.next;

        }

        if(flag==1){
            curNode = new ListNode(flag);
            preNode.next = curNode;
        }


        returnList=reverseList(returnList);
        return returnList;
    }




    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode firstNode =null;
        ListNode preNode =head;
        ListNode returnHead =preNode.next;
        while(returnHead.next!=null){
            preNode.next=firstNode;
            firstNode=preNode;
            preNode=returnHead;
            returnHead=returnHead.next;
        }
        preNode.next=firstNode;
        returnHead.next=preNode;



        return returnHead;
    }
}

