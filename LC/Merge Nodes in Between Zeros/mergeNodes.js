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
var mergeNodes = function(head) {
    const Sum = [];
    let p = head;
    let sum = 0;
    let first_0 = false;
    while(p!==null){
        if(p.val === 0 && !first_0){
            first_0 = true;
        }
        else if(p.val === 0 && first_0){
            Sum.push(sum);
            sum = 0;
        }
        else if(p.val !== 0 && first_0){
           sum+=p.val; 
        }
        p=p.next;
    }


    i=0;
    head.val = Sum[i++];
    if(Sum.length === 1){
        head.next = null;
        return head;
    }
    p=head;
    while(i< Sum.length - 1){
        p.next = new ListNode(Sum[i]);
        p=p.next;
       
        i++;
    }
    p.next = new ListNode(Sum[i], null);

    return head;
};