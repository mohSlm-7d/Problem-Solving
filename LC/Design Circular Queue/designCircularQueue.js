/**
 * @param {number} k
 */
var MyCircularQueue = function(k) {
    this.first = -1;
    this.last = -1;
    this.size = 0;
    this.capacity = k;
    this.queue = [];
};

/** 
 * @param {number} value
 * @return {boolean}
 */
MyCircularQueue.prototype.enQueue = function(value) {
    if(this.isFull()){
        return false;
    }
    if(this.isEmpty()){
        this.first = this.last = 0;
    }
    else{
        this.last = (this.last + 1) % this.capacity;
    }
    this.queue[this.last]=value;
    this.size++;
    return true;
};

/**
 * @return {boolean}
 */
MyCircularQueue.prototype.deQueue = function() {
    if(this.isEmpty()){
        return false;
    }
    if(this.size === 1){
        this.first = this.last = -1;
    }
    else{
        this.first = (this.first + 1) % this.capacity;
    }
    this.size--;
    return true;
};

/**
 * @return {number}
 */
MyCircularQueue.prototype.Front = function() {
    if(this.isEmpty()){
        return -1;
    }
    console.log(`this.first: ${this.first}`)
    return this.queue[this.first];
};

/**
 * @return {number}
 */
MyCircularQueue.prototype.Rear = function() {
    if(this.isEmpty()){
        return -1;
    }
    console.log(`this.last: ${this.last}`)
    return this.queue[this.last];
};

/**
 * @return {boolean}
 */
MyCircularQueue.prototype.isEmpty = function() {
    return this.size === 0;
};

/**
 * @return {boolean}
 */
MyCircularQueue.prototype.isFull = function() {
    return this.size  === this.capacity;
};

/** 
 * Your MyCircularQueue object will be instantiated and called as such:
 * var obj = new MyCircularQueue(k)
 * var param_1 = obj.enQueue(value)
 * var param_2 = obj.deQueue()
 * var param_3 = obj.Front()
 * var param_4 = obj.Rear()
 * var param_5 = obj.isEmpty()
 * var param_6 = obj.isFull()
 */