/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} left
 * @param {number} right
 * @return {ListNode}
 */
var reverseBetween = function(head, left, right) {
    if(left === right){
        return head;
    }

    let itr = head;
     let i = 1;
    while(itr!== null && i< left){
        itr = itr.next;
        i++;
    }
    let before = itr;
    let reverse = [];
    while(itr !== null && i <= right){
        reverse.push(itr.val);
        itr= itr.next;
        i++;
    }
    let after = itr;    
   
    i=left - 1;
    while(reverse.length!==0 && before !== null){
        before.val = reverse.pop();
        before = before.next;
    }

    if(before !== null){
        before.next = after.next;
    }
    
    return head;
    };