/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package even_and_odd_linkedlist;

/**
 *
 * @author DELL
 */
class Solution {
    public static ListNode oddEvenList(ListNode head) {
        if(head == null){
            return head;
        }

        ListNode Odd = head;        
        ListNode Even = head.next;
        ListNode Even_Ref = Even;
        while(Odd!= null && Odd.next != null && Odd.next.next != null && Even != null && Even.next!= null){
            
            Odd.next = Odd.next.next;
            Even.next = Even.next.next;

            Odd = Odd.next;
            Even = Even.next;
        }

        Odd.next = Even_Ref;

        return head;
    }
}
