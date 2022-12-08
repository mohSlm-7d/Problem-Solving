/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package range_sum_of_bst;

/**
 *
 * @author DELL
 */
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null){
            return 0;
        }

        if(root.val >= low && root.val <= high){
            return rangeSumBST(root.left, low, high) + root.val + rangeSumBST(root.right, low, high);
        }
        
        return rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);

    }
}