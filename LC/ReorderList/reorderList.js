/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {void} Do not return anything, modify head in-place instead.
 */
var reorderList = function(head) {
    const map = new Map();
    let i = 0;
    let p = head;
    while(p!==null){
        map.set(i, p.val);
        i++;
        p=p.next;
    }
    if(map.size === 1){
        return
    }
    
    p = head;
    
    i=0;
    j=map.size - 1;
    const ordered_nodes = [];
    while(i< j){        
        p.val = map.get(i);        
        
        p=p.next;
        p.val = map.get(j);
       

        i++;
        j--;

        if(i===j){
            p.next = null;
            break
        }
        p=p.next;
    }
    if(map.size % 2 !== 0){
        p.next = new ListNode(map.get(i), null);
    }

};