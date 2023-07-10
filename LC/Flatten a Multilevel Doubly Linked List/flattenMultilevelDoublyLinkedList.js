/**
 * // Definition for a Node.
 * function Node(val,prev,next,child) {
 *    this.val = val;
 *    this.prev = prev;
 *    this.next = next;
 *    this.child = child;
 * };
 */

/**
 * @param {Node} head
 * @return {Node}
 */
let values = [];
let stack = [];
const traverse = (newHead)=>{
   if(newHead === null){
       return;
       if(stack.length > 0){
           traverse(stack.pop());
       }
   }
   values.push(newHead.val);
   
   if(newHead.child !== null){
       stack.push(newHead);
   }
   traverse(newHead.child);
   traverse(newHead.next);
}
var flatten = function(head) {
   if(head === null){
       return head;
   }    
   traverse(head);
   const newHead = new Node();
   let n = newHead;
   let p = head;
   let before = null;
   let i =0;
   for(const val of values){
       n.val = val;
       n.prev = before;
       if(i === values.length - 1){
           break;
       }
       n.next = new Node();
       before = n;
       n=n.next;
       i++;
   }    

   values = [];
   stack =[];
   return newHead;
};