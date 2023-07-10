/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} list1
 * @param {number} a
 * @param {number} b
 * @param {ListNode} list2
 * @return {ListNode}
 */
var mergeInBetween = function(list1, a, b, list2) {
    let p = list1;
    let i=0;
    let start = null;
    let end = null;
    while(p!==null){
        if(i === a-1){
            start = p;   
        }
        if(i === b+1){
            end = p;
        }
        i++;
        p=p.next;
    }

    start.next = list2;
    p = list2;
    while(p.next !== null){
        p=p.next;
    }
    p.next = end;

    return list1;
};