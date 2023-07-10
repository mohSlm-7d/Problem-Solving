var MyLinkedList = function() {
    this.list = [];
};

/** 
 * @param {number} index
 * @return {number}
 */
MyLinkedList.prototype.get = function(index) {
    if(this.list.length !== 0 && index < this.list.length){
        return this.list[index];
    }
    return -1;
};

/** 
 * @param {number} val
 * @return {void}
 */
MyLinkedList.prototype.addAtHead = function(val) {
    this.list.unshift(val);
};

/** 
 * @param {number} val
 * @return {void}
 */
MyLinkedList.prototype.addAtTail = function(val) {
    this.list.push(val);
};

/** 
 * @param {number} index 
 * @param {number} val
 * @return {void}
 */
MyLinkedList.prototype.addAtIndex = function(index, val) {
    if(index <= this.list.length){
        const after = this.list.splice(index);
        this.list.push(val);
    
        while(after.length > 0){
            this.list.push(after.shift());
        }
    }
};

/** 
 * @param {number} index
 * @return {void}
 */
MyLinkedList.prototype.deleteAtIndex = function(index) {
    if(this.list.length !== 0 && index < this.list.length){
        const after = this.list.splice(index+1);
        this.list.pop();
        while(after.length > 0){
            this.list.push(after.shift());
        }
    }
};

/** 
 * Your MyLinkedList object will be instantiated and called as such:
 * var obj = new MyLinkedList()
 * var param_1 = obj.get(index)
 * obj.addAtHead(val)
 * obj.addAtTail(val)
 * obj.addAtIndex(index,val)
 * obj.deleteAtIndex(index)
 */