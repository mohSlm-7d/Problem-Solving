/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DELL
 */

class Solution
{
    
    private static Node LastInSub_Tree = null;
    
    private static Node CurrentRoot;
    private static void SubTree(Node root, Node Sub_Tree){
        if(root == null){
            return;
        }
        
        CurrentRoot = Sub_Tree;
        Sub_Tree.data = root.data;
        Sub_Tree.right = new Node(0);
        Sub_Tree.left = null;
        
        LastInSub_Tree = Sub_Tree;
        
        
        
        
        SubTree(root.left, Sub_Tree.right);
        Sub_Tree= CurrentRoot;
        SubTree(root.right, Sub_Tree.right);
        
        
        
    }
    
    public static void flatten(Node root)
    {
        //code here
        if(root == null || root.left == null && root.right == null){
            return;
        }
        
        Node Left = new Node(0);
        Node Right = new Node(0);
        if(root.left != null){
            SubTree(root.left, Left);
        }
        else{
            Left = null;
        }
        Node EndOfLeft = LastInSub_Tree;
        if(root.right != null){
            SubTree(root.right, Right);
        }
        else{
            Right = null;
        }
        
        
        if(Left != null){
            root.right = Left;
            EndOfLeft.right = null;
        }
        if(Left == null || Right != null){
            if(Left == null){
                root.right = Right; 
            }
            
            if(Left != null){
                EndOfLeft.right = Right;
            }
            if(Right != null){
                LastInSub_Tree.right = null;
            }
        }
        
        
        root.left = null;
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Start Testing...\n\n");
    }
}



