/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node = new ListNode(-1);
        ListNode ans = node;
        while(list1!=null && list2!=null){
            if(list1.val <= list2.val){
                ListNode temp = list1.next ;
                list1.next = null;
                node.next=list1;
                list1=temp;
            }
            else{
                ListNode temp = list2.next ;
                list2.next = null;
                node.next=list2;
                list2=temp;
            }
            node=node.next;
        }
        while(list1!=null){
            ListNode temp = list1.next ;
            list1.next = null;
            node.next=list1;
            list1=temp;
            node=node.next;
        }
        while(list2!=null){
            ListNode temp = list2.next ;
            list2.next = null;
            node.next=list2;
            list2=temp;
            node=node.next;
        }
        return ans.next;
    }
}