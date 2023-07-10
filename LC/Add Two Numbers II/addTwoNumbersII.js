/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function(l1, l2) {
    let num1 = "";
    let p = l1;
    while(p!==null){
        num1+=p.val;
        p=p.next;
    }
    num1 = BigInt(num1)

    let num2 = "";
    p = l2;
    while(p!==null){
        num2+=p.val;
        p=p.next;
    }
    num2 = BigInt(num2)
    let result = num1 + num2;
    result += "";
    const l3 = new ListNode();
    p=l3;
    for(let i=0; i< result.length; i++){
        p.val = result.charAt(i);
        if(i < result.length - 1){
            p.next = new ListNode();
        }
        p=p.next;
    }

    return l3;
};