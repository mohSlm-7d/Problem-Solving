/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DELL
 */


import java.util.*;
 
class Solution {
    ListNode merge(ListNode lists[])
    {
        int Size = lists.length;
        ListNode[] ReferenceOfList = new ListNode[Size];
        
        for(int i=0; i< Size; i++){
            ReferenceOfList[i] = lists[i];
        }
        
        
        ListNode AllListsSorted = new ListNode();
        ListNode NewSortedList = AllListsSorted;
        
    
        int flag = Size - 1;
        
        
        HashSet<Integer> NullList = new HashSet<>();
        Stack<Integer> copies = new Stack<>();
        
        int i=0;
        while(NullList.size() < flag){
            
            int Min = Integer.MAX_VALUE;
            copies.clear();
            for(i=0; i< Size; i++){
                
                if(ReferenceOfList[i] == null && NullList.contains(i) == false){
                    NullList.add(i);
                }
                
                else if(ReferenceOfList[i] != null){
                    
                    if(ReferenceOfList[i].val <= Min){
                        
                        if(Min == Integer.MAX_VALUE || Min == ReferenceOfList[i].val){
                            copies.push(i);
                        }
                        else if(ReferenceOfList[i].val < Min){
                            copies.clear();
                            copies.push(i);
                        }
                        
                        Min = ReferenceOfList[i].val;
                    }
                }
                
                if(NullList.size() == flag){
                    break;
                }
                
                
            }
            
            
            if(NullList.size() == flag){
                break;
            }
           
            while(!copies.isEmpty()){
                AllListsSorted.val = Min;
                AllListsSorted.next = new ListNode();
                
                
                ReferenceOfList[copies.peek()] = ReferenceOfList[copies.pop()].next;
                
                AllListsSorted = AllListsSorted.next;
            }
            
            
        }
        i=0;
        while(NullList.contains(i)){
            i++;
        }
        
        
        while(i < Size && ReferenceOfList[i] != null && ! NullList.contains(i)){
            AllListsSorted.val = ReferenceOfList[i].val;
            AllListsSorted.next = new ListNode();
            
            ReferenceOfList[i] = ReferenceOfList[i].next;
            
            AllListsSorted = AllListsSorted.next;
            
            
        }
        
        
        ListNode Iterator = NewSortedList;
        ListNode before= null;
        
        while(Iterator.next != null){
            before= Iterator;
            Iterator = Iterator.next;
        }
        
        before.next = null;
        
        
        return NewSortedList;
        
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 1){
            return lists[0];
        }
        
        boolean flagNull= true;
        int i;
        for(i=0; i< lists.length; i++){
            if(lists[i] != null){
                flagNull = false;
                break;
            }
        }
        
        if(flagNull == true){
            return null;
        }
        if(!flagNull && lists.length > 0){
            return merge(lists);
        }
        return null;
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
}