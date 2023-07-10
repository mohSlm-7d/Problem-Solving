var MinStack = function() {
    this.minStack = [];
    this.size = 0;
};

/** 
 * @param {number} val
 * @return {void}
 */
MinStack.prototype.push = function(val) {
    this.size++;
    return this.minStack.push(val);
};

/**
 * @return {void}
 */
MinStack.prototype.pop = function() {
    this.size--;
    return this.minStack.pop();
};

/**
 * @return {number}
 */
MinStack.prototype.top = function() {
    return this.minStack[this.size - 1];
};

/**
 * @return {number}
 */
MinStack.prototype.getMin = function() {
    let min = this.minStack[0];
    for(let i=0; i< this.size; i++){
        if(this.minStack[i] < min){
            min = this.minStack[i];
        }
    }

    return min;
};

/** 
 * Your MinStack object will be instantiated and called as such:
 * var obj = new MinStack()
 * obj.push(val)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */