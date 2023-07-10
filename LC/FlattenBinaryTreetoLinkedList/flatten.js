/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {void} Do not return anything, modify root in-place instead.
 */
const list = [];
const preOrderTraverse = root => {
    if(root === null){
        return ;
    }
    list.push(root.val);
    preOrderTraverse(root.left);
    preOrderTraverse(root.right);
};
var flatten = function(root) {
    preOrderTraverse(root);
    let p = root;
    while(list.length > 0){
        p.left = null;
        p.val = list.shift();
        if(list.length === 0){
            break;
        }
        p.right = new TreeNode();
        
        p=p.right;
    }
};