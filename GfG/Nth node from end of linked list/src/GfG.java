/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DELL
 */

import java.util.Stack;
class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    
        // Your code here
    	
    	Stack<Integer> Data= new Stack<>();
    	int Count=0;
    	Node p= head;
    	while(p != null){
    	    Count++;
    	    Data.push(p.data);
    	    p=p.next;
    	}
    	
    	if(n > Count){
    	    return -1;
    	}
    	
    	int i=0;
    	int Result =-1;
    	while(i< n && !Data.empty()){
    	    Result = Data.pop();
    	    i++;
    	}
    	if(i< n-1 ){
    	    return -1;
    	}
    	
    	return Result;
    	
    	
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
