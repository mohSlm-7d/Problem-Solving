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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<TreeNode> P = new ArrayList<>();
        ArrayList<TreeNode> Q = new ArrayList<>();
        
        LinkedList<TreeNode> Queue= new LinkedList<>();
        Queue.push(p);
        while(Queue.size() != 0){
            TreeNode Root = Queue.pop();
            P.add(Root);
            
            if(Root != null){
                Queue.push(Root.left);
                Queue.push(Root.right);
            }
        }
        
        Queue.push(q);
        while(Queue.size() != 0){
            TreeNode Root = Queue.pop();
            Q.add(Root);
            
            if(Root != null){
                Queue.push(Root.left);
                Queue.push(Root.right);
            }
        }
        
        
        int i=0;
        while(i< P.size() && i< Q.size() ){
            if(P.get(i) == null || Q.get(i) ==null){
                if(Q.get(i) != P.get(i)){
                    return false;
                }
            }
            else if(P.get(i).val != Q.get(i).val){
                return false;
            }
            i++;
        }
        
        
        return true;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
}