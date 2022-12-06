/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package even_and_odd_linkedlist;

/**
 *
 * @author DELL
 */
import java.util.*;
public class Even_and_Odd_LinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListNode head = new ListNode(0);
        head = Solution.oddEvenList(head);
        
        ListNode p =head;
        while(p!= null){
            System.out.print(p.val+", ");
            p=p.next;
        }
    }
    
}
