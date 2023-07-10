/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} x
 * @return {ListNode}
 */
var partition = function(head, x) {
    const lessThanMap = new Map();
    const greaterThanMap = new Map();
    let p = head;
    let i =0;
    let j = 0;
    while(p !== null){
      if(p.val < x){
        lessThanMap.set(i++, p.val);
      }
      else if(p.val >= x){
        greaterThanMap.set(j++, p.val);
      }
      p=p.next;
    }
    
    p=head;
    lessThanMap.forEach(val=>{
      p.val = val;
      p=p.next;
    });

    greaterThanMap.forEach(val=>{
      p.val=val;
      p=p.next;
    });

    return head;
};