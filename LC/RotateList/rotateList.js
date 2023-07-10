/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} k
 * @return {ListNode}
 */
var rotateRight = function(head, k) {
    if(head === null || k === 0 ){
        return head;
    }
    const reversed = [];
    let p = head;
    while(p!==null){
        reversed.push(p.val);
        p=p.next;
    }
    
    if(k === reversed.length){
        return head;
    }
    
    if(k > reversed.length){
        k = k % reversed.length;
    }
    
    let i=0;
    while(i<k){
        reversed.unshift(reversed.pop());
        i++;
    }
    
    p=head;
    for(let revItem of reversed){
        p.val=revItem;
        p=p.next;
    }

    return head;  
};