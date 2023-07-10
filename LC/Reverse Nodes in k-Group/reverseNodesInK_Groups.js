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
var reverseKGroup = function(head, k) {
    const groups = new Map();
    let p = head;
    let i = 0;
    let j = 0;
    let group = [];
    while(p !== null){
        group.push(p.val);
        p=p.next;
        j++;

         if(j % k == 0){
            j=0;
            groups.set(i++, group);
            group = [];
        }
   
    }

    //Apply the reverse operation.
    p=head;
    i=0;
    while(groups.has(i)){
        let value = groups.get(i);
        if(value.length === k){
            while(value.length>0){
                p.val = value.pop();
                p=p.next;   
            }
        }
        i++;
    }
    return head;
};