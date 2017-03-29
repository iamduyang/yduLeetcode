/**
 * 148. Sort List   (Time Limit Exceeded)
 */
public class Solution {

    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        if(head.next.next==null){
            if(head.val>head.next.val){
                ListNode headNext =head.next;
                headNext.next=head;
                head.next=null;
                return headNext;

            }
            else
                return head;
        }

        ListNode smallListHead=null, bigListHead=null,smallListCur=null, bigListCur=null,curHead=head.next;
        while(curHead!=null){

            if(curHead.val<head.val){
                if(smallListHead==null){
                    smallListHead=curHead;
                    smallListCur=smallListHead;
                    curHead=curHead.next;
                    smallListCur.next=null;
                }
                else{
                    smallListCur.next=curHead;
                    curHead=curHead.next;
                    smallListCur=smallListCur.next;
                    smallListCur.next=null;

                }

            }else{
                if(bigListHead==null){
                    bigListHead=curHead;
                    bigListCur=bigListHead;
                    curHead=curHead.next;
                    bigListCur.next=null;
                }
                else{
                    bigListCur.next=curHead;
                    curHead=curHead.next;
                    bigListCur=bigListCur.next;
                    bigListCur.next=null;

                }

            }

        }

        bigListHead=sortList(bigListHead);
        smallListHead=sortList(smallListHead);

        head.next=bigListHead;

        if(smallListHead==null){

            return head;
        }else{
            ListNode smallListTail=FindTail(smallListHead);
            smallListTail.next=head;
           return smallListHead;
        }



    }


    public ListNode FindTail(ListNode head) {
        if(head==null)
            return head;

        while(head.next!=null)
            head=head.next;

        return head;
    }

}


