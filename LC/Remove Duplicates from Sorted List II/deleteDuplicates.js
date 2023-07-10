/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var deleteDuplicates = function(head) {
    let taken = new Set();
    let duplicates = new Set();
    let parent = null;
    let iterator= head;
    
    while(iterator !== null){
        if(!taken.has(iterator.val)){
            taken.add(iterator.val);
            parent = iterator;
        }
        else{
            parent.next = iterator.next;
            duplicates.add(iterator.val);
        }
        iterator = iterator.next;
    }
    iterator = head;
    parent = null;
    while(iterator !== null){
       while(iterator !== null && duplicates.has(iterator.val)){
            if(parent === null){
                head = head.next;
            }
            iterator=iterator.next;
        }
        if(parent === null){
            parent = head;
        }       
        else{
            parent.next = iterator;
        }
        parent = iterator;
        if (iterator === null){
            break;
        }
        iterator = iterator.next;
    }
    return head;
};