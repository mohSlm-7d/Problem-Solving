/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package k_th_smallest_element_in_bst;

/**
 *
 * @author DELL
 */
import java.util.*;
class Solution {
    // Return the Kth smallest element in the given BST
    private ArrayList<Integer> InOrder = new ArrayList<Integer>();
    private void InOrderTraverse(Node root){
        if(root == null){
            return;
        }
        
        InOrderTraverse(root.left);
        InOrder.add(root.data);
        InOrderTraverse(root.right);
    }
    public int KthSmallestElement(Node root, int K) {
        // Write your code here
        InOrderTraverse(root);
        if(K <= InOrder.size()){
         return InOrder.get(K-1);   
        }
        
        return -1;
    }
}
