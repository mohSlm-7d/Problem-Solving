/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DELL
 */

//function Template for Java

class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        Node Iterator= head;
        Node ReversedList= null;
        
        while(Iterator != null){
            Node node= new Node(Iterator.data);
            node.next= ReversedList;
            ReversedList= node;
            
            Iterator = Iterator.next;
        }
        
        
        return ReversedList;
        
    }
}