/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DELL
 */

import java.util.*;

    /**
     * @param args the command line arguments
     */


class Solution
{
    //Function to remove a loop in the linked list.
    
    
    public static boolean removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        
        HashSet<Node> Nodes= new HashSet<>();
        Node p = head;
        Node before = null;
        
        while(p != null){
            if(Nodes.contains(p)){
                before.next = null;
                return true;
            }
            
            
            Nodes.add(p);
            
            before = p;
            p=p.next;
        }
        return false;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
