/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} n
 * @return {ListNode}
 */
var removeNthFromEnd = function(head, n) { 
    if(head.next === null){
        return null;
    }
   
    const ArrayList = [];

    let p = head;
    while(p!==null){
        ArrayList.push(p);
        p=p.next;
    }
    let node_to_delete = null;
    let before = null;
    while(n!==0){
        node_to_delete = ArrayList.pop();
        n--;
    }
    if(node_to_delete === head){
        head = head.next;
        return head;
    }
    before = ArrayList.pop();

    if(before !== null && before && node_to_delete){
        before.next = node_to_delete.next;
    }

    return head;
};